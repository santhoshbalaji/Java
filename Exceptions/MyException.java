import java.util.Scanner;
class MyException{
	public static void main(String[] args) {
		try{
			/*float i = 9/0;
			System.out.println(i);
			int array[] = {1,2,3};
			System.out.println(array[2]);*/
			int x = -5;
			if(x < 0){
				throw new NegException();
			}
		}
		
		/*catch(ArrayIndexOutOfBoundsException d ){
			System.out.println("You Have tried to divide a number by 0 "+d);
		}*/
		catch(NegException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e ){
			System.out.println("You Have tried to divide a number by 0 "+e);
		}
		finally{
			System.out.println("You Have tried to divide a number by 0 ");
		}
	}
}
class NegException extends Exception{
	public NegException(){
		super("The Number you entered cannot be negative");
	}
}