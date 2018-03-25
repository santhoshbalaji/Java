/*4.Reverse the elements of an array without sorting it.  */
public class Reversea{
	public static void main(String args[]){
		int a[] = {1,20,3,4,5,6,79,8,9,105};
		int k = a.length - 1;
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < a.length/2; i++){
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp; 
			k--;
		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
