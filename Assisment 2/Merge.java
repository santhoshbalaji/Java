/*3.Write a program to merge two arrays into a single array and sort the resultant array: */
public class Merge{
	public static void main(String args[]){
		int[] a = {1,2,3,5};
		int[] b = {4,16,1,2,3,22};
		int[] c = new int [a.length + b.length];
		for( int i = 0; i < c.length; i++){
			if(i < a.length){
				c[i] = a[i];
			}
			if(i >= a.length){
				c[i] = b[i-4];
			}
		}
		System.out.print("The merged array is ");
		for( int i = 0; i < 10; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for( int i = 0; i < 10; i++){
			for( int j = 0; j < 9; j++){		
				if(c[j] > c[j+1]){
					int temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}		
 			}
 		}
 		System.out.print("The sorted array is ");
 		for( int i = 0; i < 10; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}
 
