/*.
Write Java program to check if a given number is Armstrong number or not? (input 153 output 
true,  123 output false) 
An Armstrong number of 3 digit is a number for which sum of cube of its digits is e
qual to number itself 
e.g. 371 is an Armstrong number because 
3*3*3 + 7*7*7 + 1*1*1 = 371
). */

import java.util.Scanner;
class armstrong{
	public static void main(String a []){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = input.nextInt();
		int n = num;
		double num1, num2, num3;
		num1 = num%10;
		num = num/10;
		num2 = num%10;
		num = num/10;
		num3 = num%10;
		num = num/10;
		double  sum = (Math.pow(num1,3)) + (Math.pow(num2,3)) + (Math.pow(num3,3));; 
		if (n == sum){
			System.out.println("The given number is a Armstrong number");
		}
		else
			System.out.println("The given number is not a Armstrong number");
	}
}
