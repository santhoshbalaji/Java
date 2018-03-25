import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
public class CPMProblem{
	public ArrayList<CPMActivity> activities;//change access specifier to private later on
	public HashMap<String,String> predList;//change access specifier to private later on
	public HashMap<String,String> isuccessorList;
	public CPMProblem(String filePath) throws Exception{
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		String activity = "";
		activities = new ArrayList<CPMActivity>();
		predList = new HashMap<String,String>();
		isuccessorList = new HashMap<String,String>();
        while(scanner.hasNextLine()){                    
                                
			String str = scanner.nextLine();
			if (str.equals("")){
				String[] data = activity.split("@");
				CPMActivity a = new CPMActivity(data[0],data[1],Double.parseDouble(data[3]));
				String key = data[0];
				String value = data[2];
				predList.put(key,value);
				activities.add(a);
				
				
				
				activity="";
			}
			else{
				activity += str+"@";
				
			}
		}
		fillSuccessorMap();
		fillESEF();
		fillLFLS();
		getCriticalPath();
		
		
		
		
	}
	/**
		for a given activity id, returns the activity object
	*/
	public CPMActivity getActivity(String id){
		int n = activities.size();
		for (int i = 0; i < n; i++){
			CPMActivity activity = activities.get(i);
			if (activity.id.equals(id)){
				return activity;
			}
		
		}
		return null;
	
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < activities.size(); i++){
			sb.append(activities.get(i).toString());
			sb.append("predecessor List : " + predList.get(activities.get(i).id) +"\n"+"\n");
		}
		return new String(sb);
	
	}
	public void fillESEF(){
		fillESEFforStartActivities();
		fillESEFforRemaining();
		
	
	}
	public void fillESEFforStartActivities(){
		Set<String> keyset = predList.keySet();
		Iterator<String> keys = keyset.iterator();
		while(keys.hasNext()){
			String key = (String) keys.next();
			String value = predList.get(key);
			if (value.equals("-")){
				CPMActivity activity = getActivity(key);
				activity.es = 0;
				activity.ef = activity.es + activity.duration;
			}
		}
	
	}
	public void fillESEFforRemaining(){
		int n = activities.size();
		for (int i = 0; i < n; i++){
			CPMActivity activity = activities.get(i);
			String key = activity.id;
			String value = predList.get(key);
			if (!value.equals("-")){
				String[] ps = value.split(",");
				double[] da = new double[ps.length];
				int posn = 0;
				for (int j = 0; j < ps.length; j++){
					da[posn++] = getActivity(ps[j]).ef;
				}
				activity.es  = getMax(da);
				activity.ef = activity.es + activity.duration;
							
			}
					
		}
	
	}
	public double getMax(double[] d){
		double max = 0;
		int n = d.length;
		for (int i = 0; i < n; i++){
			if (max < d[i]){
				max = d[i];
			}
		}
		return max;
	}
	public double getMin(double[] d){
		double min = d[0];
		int n = d.length;
		for (int i = 1; i < n; i++){
			if (min > d[i]){
				min = d[i];
			}
		}
		return min;
	}
	public void fillSuccessorMap(){
		int n = activities.size();
		for (int i = n-1; i >= 0; i--){
			CPMActivity activity = activities.get(i);
			String key = activity.id;
			StringBuffer valueBuffer = new StringBuffer();
			boolean found = false;
			for (int j = i+1; j < n; j++){
				CPMActivity activitys = activities.get(j);
				String pl = predList.get(activitys.id);
				if (pl.indexOf(key) != -1){
					valueBuffer.append(activitys.id + ",");
					found = true;
					
				}
				
			
			}
			if (!found){
				
				isuccessorList.put(key,"-");
			}
			else{
				String temp = new String(valueBuffer);
				int m = temp.length();
				String value = temp.substring(0,m-1);
				isuccessorList.put(key,value);
			}
			
			
		}
		System.out.println(isuccessorList);
		
	
	
	}
	public void fillLFLS(){
		int n = activities.size();
		for (int i = n-1; i >= 0; i--){
			CPMActivity activity = activities.get(i);
			String id = activity.id;
			String ss = isuccessorList.get(id);
			if (ss.equals("-")){
				activity.lf = activity.ef;
				activity.ls = activity.lf - activity.duration;
			
			}
			else{
				String key = activity.id;
				String value = isuccessorList.get(key);
				String[] ssa = value.split(",");
				int m = ssa.length;
				double[] lss = new double[m];
				int posn = 0;
				for (int j = 0; j < m; j++){
					lss[posn++] = getActivity(ssa[j]).ls;
				}
				activity.lf = getMin(lss);
				activity.ls = activity.lf - activity.duration;
			
			}
		}
	
	}
	public ArrayList<String> getCriticalPath(){
		ArrayList<String> cp = new ArrayList<String>();
		for (CPMActivity activity: activities){
			if ((activity.es == activity.ls)&& (activity.ef == activity.lf)){
				cp.add(activity.id);	
			}
		
		}
		return cp;
	}
}
