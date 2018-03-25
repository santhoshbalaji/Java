class sumandaveragea
{
	public static void main(String args[])
	{
		int i=1,sum=1;
		while(i<99)
		{
			i++;
			sum=i+sum;			
		}
		System.out.println("The sum of 1 to 100 numbers is "+sum);	
		int average=sum/100;
		System.out.println("The average obtained is "+average);
	}
}
