/*1.
Read a list of numbers from the user, and return the 
sum of all the elements
.*/
import java.util.Scanner;
class sumofelements{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total numbers:");
		int total = input.nextInt();
		System.out.println("Enter the list of numbers");
		int numbers[] = new int[total];
		int sum = 0;
		for (int i = 0; i < total; i++){
			System.out.print("Enter the "+i+" value:");
			numbers[i] = input.nextInt();
			sum = sum + numbers[i];
		} 
		System.out.println("The sum of given numbers is "+sum);
	}
}
