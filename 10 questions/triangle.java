import java.util.Scanner;
class triangle
{
		public static void main(String args[])
		{
			System.out.print("Enter the Base:");	
			Scanner input=new Scanner(System.in);
			int b=input.nextInt();
			System.out.print("Enter the Height:");
			int h=input.nextInt();
			float a=(b*h)/2;
			System.out.println("the area is "+a);
		}
}
