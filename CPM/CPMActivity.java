public class CPMActivity{
	
	public String id;
	public String name;
	public double duration;
	public double es;
	public double ef;
	public double ls;
	public double lf;
	public boolean isCritical;
	
	public CPMActivity(String id, String name, double duration){
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.es = 0;
		this.ef = 0;
		this.ls = 0;
		this.lf = 0;
		this.isCritical = false;
	
	}
	public String toString(){//overriding the toString method in the supermost class java.lang.Object
		StringBuffer sb = new StringBuffer();
		sb.append("Activity id       	:   " + this.id + "\n");
		sb.append("Activity Name     	:   " + this.name+ "\n");
		sb.append("Activity Duration 	:   "+ this. duration+ "\n");
		sb.append("Earliest Start time 	:   " + this.es  + "\n");
		sb.append("Earliest Finish time    :   " + this.ef  + "\n");
		sb.append("Latest Start time 	:   " + this.ls  + "\n");
		sb.append("Latest Finish time 	:   " + this.lf 	 + "\n\n");
		return new String(sb);
		
	}
}
