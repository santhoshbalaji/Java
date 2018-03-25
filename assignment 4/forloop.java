import java.util.Scanner;
class forloop
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println("The program counts for you.");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the starting value: ");
		i=input.nextInt(); 
		System.out.print("Enter the ending value: ");
		j=input.nextInt(); 
		System.out.print("Enter the increment value: ");
		k=input.nextInt();
		for(int l=i;l<=j;l=l+k)
		{
			System.out.println(+l);		
		} 	
	}
}
