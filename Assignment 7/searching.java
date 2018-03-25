/*5.
Searching  for  a  particular  element  in  an  array.  Return  the  index  of 
an  element  if  found,  else 
return -1.*/
import java.util.Scanner;
class searching{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num[] = {2,3,4,5,6,7,8,9,1,10};
		System.out.print("Enter a number to check:");
		int check = input.nextInt();
		int ans = 0;
		for (int i = 0; i < 10; i++){
			if(num[i] == check){
				ans = i;
			}
		}
		System.out.println("The number "+check+" is in "+ans);
	}
}
