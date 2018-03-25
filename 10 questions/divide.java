import java.util.Scanner;
class divide
{
	public static void main(String args[])
	{
		int n1,n2,a;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the 1st number:");
		n1=input.nextInt();
		System.out.print("Enter the 2nd number:");
		n2=input.nextInt();
		if(n2==0)
			{
				System.out.println("A number cannot be able to divide by zero");
			}
		else
			{
				a=n1/n2;
				System.out.println("The quotient is "+a);			
			}
	}
}
