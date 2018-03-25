import java.util.Scanner;
class whileloop
{
	public static void main(String args[])
	{
		int i,j,k,l=0;
		System.out.println("The program counts for you.");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the starting value: ");
		i=input.nextInt(); 
		System.out.print("Enter the ending value: ");
		j=input.nextInt(); 
		System.out.print("Enter the increment value: ");
		k=input.nextInt();
		l=i;
		System.out.println(+l);
		while(l<=(j-1))
		{
			
			l=l+k;
			System.out.println(+l);
		}
	}
}
