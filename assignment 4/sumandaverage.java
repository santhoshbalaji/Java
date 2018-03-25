class sumandaverage
{
	public static void main(String args[])
	{
		int  sum = 0;
		for(int i = 1;i<100;i++)
		{
			sum = i+sum;			
		}
		System.out.println("The sum of 1 to 100 numbers is "+sum);	
		int average = sum/100;
		System.out.println("The average obtained is "+average);
	}
}
