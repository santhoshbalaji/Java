import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		float N1,N2,A;
		int OP;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the 1st number:"); 
		N1=input.nextInt();	
		System.out.print("Enter the 2nd number:"); 
		N2=input.nextInt();	
		System.out.println("Select the method of operation:");
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.modulus");
		OP=input.nextInt();
		
				switch(OP)
				{
					case 1:
						A=N1+N2;
						System.out.println("The value is "+A);
					break;
					case 2:
						A=N1-N2;
						System.out.println("The value is "+A);
					break;
					case 3:
						A=N1*N2;
						System.out.println("The value is "+A);
					break;
					case 4:
						A=N1/N2;
						System.out.println("The value is "+A);
					break;
					case 5:
						A=N1%N2;
						System.out.println("The value is "+A);
					break;
					default:
						System.out.println("The entered value is wrong.");	
					break;
				}
		
			
		
	}
}
