import java.util.Scanner;
class printdayinword
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=input.nextInt();	
		if(a<=6)
			{
				switch(a)
				{
					case 0:
						System.out.println("Monday");
					break;
					case 1:
						System.out.println("Tuesday");
					break;
					case 2:
						System.out.println("Wednesday");
					break;
					case 3:
						System.out.println("Thursday");
					break;
					case 4:
						System.out.println("Friday");
					break;
					case 5:
						System.out.println("Saturday");
					break;
					case 6:
						System.out.println("Sunday");
					break;
				}
			}
		else
			System.out.println("Not a valid day");
	}
}
