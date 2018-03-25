/*2.
Create three arrays of the same size, returns the third array with t
he product of the elements 
with the same indexes respectively.*/
class threearray{
	public static void main(String args[]){
		int array3[] = new int[4];
		int array1[] = {2,3,4,5};
		int array2[] = {2,3,4,5};
		for(int i = 0;i < 4;i++ ){
			array3[i] = array1[i]*array2[i];
			System.out.print(array3[i]+"\t"); 
		}
		System.out.println();
	}
} 
