class three
{
	public static void main(String a[])
	{
		int x=Integer.parseInt(a[0]);
		int y=Integer.parseInt(a[1]);
		int z=Integer.parseInt(a[2]);
		System.out.println("The value of x:"+x);
		System.out.println("The value of y:"+y);
		System.out.println("The value of z:"+z);
	if((x<y) && (x<z))
	{
       		System.out.println("The smallest no is:" +x);
	}
	else if(y<z)
	{
		System.out.println("The smallest no is:" +y);
	}
	else
		System.out.println("The smallest no is:"+z);
	}
}
