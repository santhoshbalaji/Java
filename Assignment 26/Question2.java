/*Generate ‘n’ random numbers between 0 and 99 and add them to the ArrayList. Find the 
maximum of those numbers.*/
import java.util.ArrayList;
import java.util.Iterator;
class Question2{
	public static void main(String[] args) {
		int com;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++){
			com = (int)Math.round(Math.random() * 99) ;
			array.add(com);
		}	
		/*for(int i = 0; i < array.size(); i++){
			for(int j = 0; j < array.size()-1; j++ ){
				int a = array.get(j);
				int b = array.get(j + 1);
				if (a < b){
					array.set(j,b);
					array.set(j+1,a);
				}
			}	
		}*/
		com = array.get(0);
		for(int i = 1; i < 100; i++){
			if(com < array.get(i)){
				com = array.get(i);
			}

		}
		Iterator n = array.iterator();
		System.out.print("[");
		while(n.hasNext()){
			System.out.print(n.next()+ ",");
		}
		System.out.println("]");
		System.out.println(com);
		// System.out.println("The maximum number is "+array.get(0));
		// System.out.println(array);
	} 
}