import java.util.Scanner;
class Password{
	public static void main(String[] args) {
		int count = 0,value = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Password");
		String password = input.next();
		if(password.length() <= 10){
			for(int i = 0; i < password.length(); i++){
				value = password.charAt(i);
				System.out.println(value);
			}	
			if(value >= 48 && value <= 57) && ((value >= 65 && value >= 90) || (value >= 97 && value >= 123)){
				count++;
			}
			else{
				System.out.println("nothing");
			}
			
			if(count >= 2){
				System.out.println("Password is valid");
			}
			else{
				System.out.println("Password should contain atleast two numbers");
			}
		}
		else{
			System.out.println("Password must contain only or less than 10 characters");
		}
		count = 0;
		
	}

}