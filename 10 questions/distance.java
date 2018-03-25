import java.util.Scanner;
class distance
{
	public static void main(String args[])
		{
			double x1,x2,y1,y2;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the x1 value:");
			x1=input.nextDouble();
			System.out.print("Enter the x2 value:");
			x2=input.nextDouble();
			System.out.print("Enter the y1 value:");
			y1=input.nextDouble();
			System.out.print("Enter the y2 value:");
			y2=input.nextDouble();
			double a=2;
			double d=Math.sqrt((Math.pow((x2-x1),a))+(Math.pow((y2-y1),a)));
			System.out.println("The distance is "+d);	
		}
}
