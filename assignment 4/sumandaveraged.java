class sumandaveraged
{
	public static void main(String args[])
	{
		int i=1,sum=0;
		do
		{
		i=i+2;
		sum=i+sum;
		}
		while(i<=99);
		System.out.println("The sum of odd numbers between 1 to 100 numbers is "+sum);
		int average=sum/50;
		System.out.println("The average obtained is "+average);	
	}
}
