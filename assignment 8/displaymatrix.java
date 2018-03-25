/*1.
Display the matrices in a neat format */
import java.util.Scanner;
class displaymatrix{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int row = input.nextInt();
		System.out.print("Enter the number of columns:");
		int columns = input.nextInt();
		int matrixa[][] = new int [row][columns];
		int matrixb[][] = new int [row][columns];
		int matrixc[][] = new int [row][columns];
		System.out.println("Enter the values for 1st matrix");
		for(int i = 0; i < row; i++){
		System.out.println("Enter the numbers");
			for(int j = 0; j < columns; j++){
				
				matrixa[i][j] = input.nextInt();
			}
		}
		System.out.println("The value in the matrixa is");
		for(int i = 0; i < row; i++){
			for(int j = 0; j <columns; j++){
				System.out.print(matrixa[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Enter the values for 2nd matrix");
		for(int i = 0; i < row; i++){
		System.out.println("Enter the numbers");
			for(int j = 0; j < columns; j++){
				
				matrixb[i][j] = input.nextInt();
			}
		}
		System.out.println("The value in the matrixb is");
		for(int i = 0; i < row; i++){
			for(int j = 0; j <columns; j++){
				System.out.print(matrixb[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
