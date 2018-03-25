class average
{
	public static void main(String args[])
	{
		
		int m1=Integer.parseInt(args[0]);
		int m2=Integer.parseInt(args[1]);
		int m3=Integer.parseInt(args[2]);
		int m4=Integer.parseInt(args[3]);
		int m5=Integer.parseInt(args[4]);
		int avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("The average mark of the student is "+avg+" percentage");	
		if((avg > 91) && (avg < 100))
		{
			System.out.println("The Student got Grade A with "+avg+" percentage");
		}
		else if((avg > 71) && (avg < 90))
		{
			System.out.println("The Student got Grade B with "+avg+" percentage");
		}
		else if((avg > 51) && (avg < 70))
		{
			System.out.println("The Student got Grade C with "+avg+" percentage");
		}
		else
		{
			System.out.println("The Student got Grade D with "+avg+" percentage");
		}	
	}	
}
