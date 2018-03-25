import java.util.Scanner;
class older
{
	public static void main(String args[])
	{	
		int d1,m1,y1,d2,m2,y2;
		String n1,n2;
		System.out.print("Enter the 1st person name:");	
		Scanner input=new Scanner(System.in);
		n1=input.next();
		System.out.println("Enter the 1st person's date of birth one by one(dd,mm,yyyy):");	
		d1=input.nextInt();
		m1=input.nextInt();
		y1=input.nextInt();
		System.out.print("Enter the 2st person name:");
		n2=input.next();
		System.out.println("Enter the 2st person's date of birth one by one(dd,mm,yyyy):");	
		d2=input.nextInt();
		m2=input.nextInt();
		y2=input.nextInt();
		
				
		if(y1>y2)
			{
				System.out.println("Person "+n2+" is the oldest");				
			}
			else if(y1==y2)
				{
				if(m1>m2)
					{
						System.out.println("Person "+n2+" is the oldest");
					}
				else if(m1==m2)
					{
					if(d1>d2)
						{
							System.out.println("Person "+n2+" is the oldest");
						}
					else if(d1==d2)
						{
							System.out.println("Both the person has same age");
						}
						else
							System.out.println("Person "+n1+" is the oldest");
					}	
					else
						System.out.println("Person "+n1+" is the oldest");
						
				}
				else
					System.out.println("Person "+n1+" is the oldest");
	}
}
			
			
		
	

