/*5.Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on theoutside and the longer string on the inside. The strings will not be the same length. */
public class Length{
	public static void main(String args[]){
		String name1 = "Santhosh";
		String name2 = "Balaji";
		int a = name1.length();
		int b = name2.length();
		if(a > b){
			System.out.println(name2+" "+name1+" "+name2);
		}
		else
			System.out.println(name2+" "+name1+" "+name2);		
	}
}
