/*2.Write a program called TestPalindromicWord- Read a String from the user and check if it’s a Palindrome or not. Try with and without String built in methods. A word that reads the same backward as forward is called a palindrome, e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).  */
public class TestPalindromicWord{
	public static void main(String args[]){
		String name = "madam";
		String newname = new String(name); 
		//System.out.println(newname.length());
		int j = name.length()-1;
		for (int i = 0 ; i < name.length(); i++) {
			newname = newname.replace(newname.charAt(i),name.charAt(j));
			j--;
		}
		if(name.equals(newname)){
			System.out.println("The given string "+newname+" is a palindrome");
		}else{
			System.out.println("The given String is not a palindrome");
		}
	}
}
