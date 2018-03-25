/*8.Read a string (with even number of characters) from the user and swap each pair of consecutive characters. For example "zoho" should be returned as "ozoh". */
public class Zoho{
	public static void main(String args[]){
		String original = "zoho";
		int k = 4;
		for(int i = 0; i < 4/2; i++){
			char temp = original.charAt(k);
			original.charAt(k) = original.charAt(i);
			original.charAt[i] = temp; 
			k--;
		}
		System.out.println(temp);
	}
}
