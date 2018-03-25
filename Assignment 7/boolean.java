/*.
A program to check if an array of integers contains two specified elements 9
6 and 7. Return a Boolean value accordingly */
class booleanarray{
	public static void main(String args[]){
		int array[] = {1,2,7,96,96};
		int num1 = 0,num2 = 1;
		for(int i = 0; i <= 4; i++){
			if(array[i] == 7){
				num1 = 2;
			}
			if(array[i]  == 96){
				num2 = 2;
			}
			
		}
		if(num1 == num2){
				System.out.println("The array contains the given numbers");
		}
		else
			System.out.println("The array does not contains the given number");
			
	}
}
