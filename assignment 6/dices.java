/*3.
How  many  times  do  you  have  to  roll  a  pair  of  dice  before  they  come 
up  snake  eyes?.  Write  a 
computer program that simulates the experiment. The program should report t
he number of rolls 
that it makes before the dice come up snake eyes. (Note: "Snake e
yes" means that both dice show 
a value of 1.) Use Random class to generate two numbers (within 6) for each dice. */
import java.util.Random; 
class dices{
	public static void main(String args[]){
		
		Random input=new Random();
		int data = 1,dice1 = 0,dice2 = 0,i;
		
			for(i = 0;dice1 != 1 || dice2 != 1;i++){
		
				dice1 = input.nextInt(6)+1;
				dice2 = input.nextInt(6)+1;
				System.out.println(dice1 + " " + dice2);
					
			}
		System.out.println(i-1);
	}
}
