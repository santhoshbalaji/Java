/*6.Transpose of a Matrix -for a given matrix, this returns the transposed matrix  */
class transposematrix{
	public static void main(String args[]){
		int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int transpose[][] = new int[3][3];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				transpose[i][j] = array[j][i];
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	} 
}
