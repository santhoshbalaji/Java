import java.util.Scanner;
class divisiblefor
{
	public static void main(String args[])
	{
		int i;
		Scanner input=new Scanner(System.in);
		int j;
		System.out.print("Enter the number:");
		j=input.nextInt();
		for(i=1;i<100;i++)
		{
			if(i%j==0)
			{
				System.out.println("The no"+i);
			}		
		}	
	}
}
