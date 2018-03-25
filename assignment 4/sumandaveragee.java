class sumandaveragee
{
	public static void main(String args[]){
		int i = 6,sum = 0,divide, num = 0;
		float average;
		
		while(i<100)
			{
				i++;
				if(i%7 =  = 0)
				{
				sum = i+sum;
				num++;
				}	
						
			}	
			
		System.out.println("The sum of 1 to 100 numbers is "+sum);
		System.out.println("The total numbers that are divisible by 7 is:"+num);
		average = (float)sum/num;
		System.out.println("The average obtained is "+average);
		
	}
}
