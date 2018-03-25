/*5.Unique Elements: Write a program to remove duplicate values and store only the distinct elements of an already sorted array. */
public class Unique{
	public static void main(String args[]){
		int a[] = {1,1,2,2,3,3,4,5,16,22};
		int temp = a.length;
		for ( int i = 0; i <= a.length-1; i++){
			if(i < a.length-1){
				if(a[i] == a[i+1]){
					continue;
				}
			}	
			System.out.print(a[i]+" ");
		}
			
		System.out.println();	
	}
}
