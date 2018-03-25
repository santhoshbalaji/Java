import java.util.Scanner;
class userdata
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int num=input.nextInt();
	int sum=0;
	


	while(num>=0)
		{
			sum=sum+num;			
			System.out.print("Enter the number:");
			num=input.nextInt();
			
					
		}
	System.out.println("The sum of all numbers entered is "+sum);
	}
}
