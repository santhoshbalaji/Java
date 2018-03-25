import java.util.Scanner;
class arraydata{
	public static void main(String args[]){
		Scanner mark = new Scanner(System.in);
		int marks[] = new int[10];
		int sum = 0;
		for (int index = 0; index < marks.length; index++){
			System.out.println("Enter ten marks");
			marks[index] = mark.nextInt();
			
			sum += marks[index];
		}
		for (int i = 0; i < marks.length; i++){
			System.out.println(marks[i]);
		}
		System.out.println(sum);
		//for (int data:marks){
		//	System.out.println("The obtained marks is"+data);
		//}
	}
}
