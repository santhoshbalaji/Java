/*4.Reverse the elements of an array without sorting it.  */
public class Reverse{
	public static void main(String args[]){
		int a[] = {1,20,3,4,5,6,79,8,9,105};
		int b[] = new int [10];
		int j = 9;
		System.out.println("Array before the reverse");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length; i++){
				if(j >= 0){
				b[j] = a[i];
				}
				j--;
		}
		for (int i = 0; i < a.length; i++){
			a[i] = b[i];
		}
		System.out.println();
		System.out.println("Array after the reverse");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
}
