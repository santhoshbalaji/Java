import java.util.Scanner;
class ques6
{
	public static void main(String args[])
	{
		int row,col,num,a=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows for floyd's triangle:");
		num=input.nextInt();
		System.out.println("Floyd triangle");
		System.out.println("****************");
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=row;col++)
			{
				a++;
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
	}
}
