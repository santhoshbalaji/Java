/*4.Construct a Unit Matrix - For a given n, construct a unit matrix (diagonal elements are unity) for ex if n = 3 it returns [[1,0,0],[0,1,0],[0,0,1]]*/
import java.util.Scanner;
class unitmatrix{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = input.nextInt();
		int zero = 1;
		int array[][] = new int [n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				array[i][i]=1;
				System.out.print(array[i][j]);
			}
			System.out.println();
		}		
	}
}
