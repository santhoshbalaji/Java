import java.util.ArrayList;
class ArraylistC{
	public ArraylistC(){
	}
	public String toString(){
		return "hello";
	}
	public static void fill(int[] a,int val){
		System.out.println("{")
		for(int i = 0; i < a.length(); i++){
			System.out.print(a[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Object> num = new ArrayList<Integer>();
		//num.removeRange(0,2);
		int array[] = {1,2,3,4,5};
		ArraylistC n = new ArraylistC();
		n.fill(array[],int array.length());
		for(int i = 0; i < array.length(); i++){
			num.add(array[i]);
		}
		num.add(2);
		Iterator itr = num.Iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		for(Object o:num){
			System.out.println(o);
		}
	}
}