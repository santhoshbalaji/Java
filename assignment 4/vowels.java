import java.util.Scanner;
class vowels
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in).useDelimiter("\\s*-\\s*");
		System.out.println("Enter the line of text:");
		String name = s.next();	
		
		for(char c :name.toCharArray())
		{
		
			switch(c)
			{
				case 'a':
					System.out.println(c+" is a vowel");
				break;
				case 'e':
					System.out.println(c+" is a vowel");
				break;
				case 'i':
					System.out.println(c+" is a vowel");
				break;
				case 'o':
					System.out.println(c+" is a vowel");
				break;
				case 'u':
					System.out.println(c+" is a vowel");
				break;
				default:
					System.out.println(c+" is not a vowel");
			}
			
		}	
		
	}
}
