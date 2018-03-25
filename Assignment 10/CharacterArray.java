/*4.Create a new String object with the contents of a character array (starting from its second element till the next 5 elements).Make sure the array indices are valid*/
public class CharacterArray{
	public static void main(String args[]){
		String original = "Java Exercises are lot of fun";
		int a = 5;
		int b = 10;
		System.out.println(original.substring(a,b));
	}
}
