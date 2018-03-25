/*3.
Find the number of odd integers in a given array of integers. */
//import java.util.Scanner;
class oddnumbers{
	public static void main(String args[]){
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0;i <=9; i++){
			if(array[i]%2 != 0){
				System.out.println("the odd numbers are "+array[i]);
			}
		}		
	}
}
