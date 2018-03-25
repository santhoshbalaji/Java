class Exception{
	public static void main(String[] args) {
		try{
			float i = 9/10;
			System.out.println(i);
			int array[] = {1,2,3};
			System.out.println(array[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException d ){
			System.out.println("You Have tried to divide a number by 0 "+d);
		}
		catch(Exception e ){
			System.out.println("You Have tried to divide a number by 0 "+e);
		}
		finally{
			System.out.println("You Have tried to divide a number by 0 ");
		}
	}
}