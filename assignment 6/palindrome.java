/*5.
Write a program called NumberPalindrome to check if the number entered by the user and its reverse are one and the same.*/ 
import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int inp = input.nextInt();
		int ans = inp;
		int sum = 0,res = 0;
		
		while(inp > 0){
		
			int digit = inp%10;
			sum = sum + digit;
			inp = inp/10;
			res = (res * 10) + digit;
		
		}	
		if(ans == res){
			System.out.println("The given input "+ans+" is palindrome");
		}
		else{
			System.out.println("The given input "+ans+" is not a palindrome");
		}
	}
}
