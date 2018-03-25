/*6.Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2. Sample data: 
(“Hello”) → “lololo” 
(“ab”) → “ababab” */
public class Lasttwo{
	public static void main(String args[]){
		String name = "hello";
		int num = name.length()-2;
		for(int i = num; i < num+2; i++ ){
			System.out.print(name.indexOf(i));
		}
	}
	System.out.println();
}
