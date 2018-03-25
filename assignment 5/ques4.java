class ques4
{
	public static void main(String args[])
	{
		int row,col;
		for(row=1;row<5;row++)
		{
			System.out.println("Outside Loop = "+row);
			for(col=1;col<=row;col++)
			{
				System.out.println("     Nested Loop = "+col);
			}
		}
	}
}
