/*	8.
Write a program called CircleComputation, which prompts user for a radius (in double) and compute the area and circumference of the circle rounded to 2 decimal places. The program shall repeatedly prompt for the radius, until the user enters -
1.  Hints: π is kept in a constant called Math.PI. 
	Enter the radius: 1.2 
	The area is: 4.52 
	The circumference is: 7.53 
	Enter the radius: 2.1 
	The area is: 13.85 
	The circumference is: 13.19 
	Enter the radius: -1 */

import java.util.Scanner;
public class CircleComputation{
	public static void main(String args[]){
	
		for( int i = 1; i > 0; i++){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the radius:");
			float radius = input.nextFloat();
			double two = 2;
			double area = 0;
			area = Math.PI*(Math.pow(radius,two));
			double circumference = 0;
			circumference = two * Math.PI*( radius );
			System.out.println("The area is "+area);
			System.out.println("The circumference is "+circumference);
		
		}
	}
}	
