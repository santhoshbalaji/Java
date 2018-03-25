class sumandaverageb
{
	public static void main(String args[])
	{
		int i=0,sum=0;
		do
		{
		i++;
		sum=i+sum;
		}
		while(i<99);
		System.out.println("The sum of 1 to 100 numbers is "+sum);
		int average=sum/100;
		System.out.println("The average obtained is "+average);	
	}
}
