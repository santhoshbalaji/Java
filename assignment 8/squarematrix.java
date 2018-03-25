/*5.
Construct a Square Zero Matrix - For a given n, this returns a square matrix of type n where all elements are zero. for ex if n = 3 it returns [[0,0,0],[0,0,0],[0,0,0]*/
import java.util.Scanner;
class squarematrix{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = input.nextInt();
		int array[][] = new int [n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				array[i][j]=array[0][0];
				System.out.print(array[i][j]);
			}
			System.out.println();
		}		
	}
}
