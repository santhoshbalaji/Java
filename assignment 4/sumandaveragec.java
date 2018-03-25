class sumandaveragec
{
	public static void main(String args[])
	{
		int sum = 0,k = 0,i,average;
		
		for(i = 111;i< = 8899;i++)
		{
			sum = i+sum;
			k++;		
		}
		
		System.out.println("The sum of 111 to 8899 numbers is "+sum);	
		average = sum/k;
		System.out.println("The average obtained is "+average);
		System.out.println("The total numbers between 111 to 8899 is "+k);
	}
}
