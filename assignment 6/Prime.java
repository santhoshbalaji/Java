/*9.
Read a number from the user and check if it is a PrimeNumber or not. Extend the program to display the first n prime numbers. 
Prime numbers from 1 to 100 are : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 */
public class Prime{
	public static void main(String args[]){
		int num = 0;
		for(int i = 1; i <= 100; i++){
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					num = 0;
					break;
				}	
				else{
					num = 1;
				}	
			}	
			if(num == 1){
				
			}
		}
	}
}
