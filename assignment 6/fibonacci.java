/*2.
The Fibonacci number sequence is 1, 1, 2, 3, 5, 8, 13, 21, etc. In other words, the next value of 
the sequence is the sum of the previous two values in the sequence. Write a Java program to 
generate the first 20 Fibonacci numbers. 
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 */
class fibonacci{
	public static void main(String args[]){
	
		int f = 0,f1 = 1,f2 = 0;
	
		for (int i = 1;i <= 20;i++){
		
		
			f2 = f + f1;
			System.out.println(f2);	
			f1 = f;
			f = f2;
					
		}
	}
}
 
