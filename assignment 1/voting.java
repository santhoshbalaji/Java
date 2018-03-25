class voting
{
	public static void main(String a[])
	{
	int v=Integer.parseInt (a[0]); 
	if(v>18)
	{
		System.out.println("Age is eligible to vote:"+v );
	}
	else
	{
		System.out.println("Age is not eligible to vote:"+v);	
	}
	}
}
