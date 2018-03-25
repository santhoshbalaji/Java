import java.util.Scanner;
class scannerclass{
		public static void main(String args[]){
			System.out.print("Enter the name:");	
			Scanner input=new Scanner(System.in);
			String name=input.next();
			System.out.print("Enter the age:");
			int age=input.nextInt();
			System.out.print("Enter the average:");
			float average=input.nextFloat();
			System.out.print("Enter the gender:");
			char gender=input.next().charAt(0);
			System.out.println("The given name is "+name);
			System.out.println("The given age is "+age);
			System.out.println("The given average is "+average);
			System.out.println("The given gender is "+gender);
		}		

}
