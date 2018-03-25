/*8.
Write a Java program to copy an array by iterating the array. 
Sample Output: 
Source Array : [25, 14, 56, 15, 36, 56, 77, 18, 29,
 49]                                               
New Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]*/
class copy{
	public static void main(String args[]){
		int sourcearray[] = {25, 14, 56, 15, 36, 56, 77, 18, 29,49};
		int newarray[] = new int[10];
		for(int i = 0; i < 10; i++){
			newarray[i] = sourcearray[i];
			System.out.print(newarray[i]+","); 
		}
		System.out.println();
	}
}
