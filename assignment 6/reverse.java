/*4.
Write a program called ReverseExtractDigits to extract each digit from an integer, in the reverse order and print the sum of digits of the number 
Input : Data = 12342 Output =12*/
import java.util.Scanner;
class Reverse{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int inp = input.nextInt();
		int sum = 0,res = 0;
		
		while(inp > 0){
		
			int digit = inp%10;
			sum = sum + digit;
			inp = inp/10;
			res = (res * 10) + digit;
		
		}	
		
		System.out.println("The reverse order of the given input is "+res);
		System.out.println("The sum of the given number is "+sum);
	
	}
}
