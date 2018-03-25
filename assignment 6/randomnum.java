/*Write a program to generate any 10 random numbers between 0 and UPPERLIMIT whenever 
you run the code.
Hint : Use appropriate method from Random Class from Util package. 
Find the Factorial of each of those random numbers without using recursion. */ 


import java.util.Random;
import java.util.Scanner;
class randomnum{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the UPPER LIMIT:");
		int data=input.nextInt();
		
		for(int i = 1;i <= data;i++){
		
			Random inputa = new Random();
			int num = inputa.nextInt(10);
			int factor = 1;
		
		for(int j = num;j > 0;j--){

			factor = factor * j;
 			
		}
		
		System.out.println(num+"! is "+factor); 
		
		}	
	}
}
