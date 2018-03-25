class FormatMethod{
	public static void main(String args[]){
		String name = "HELLO";
		String temp ="";
		for (int i = 0; i < name.length(); i++){
			System.out.println(temp+name.charAt(i));
			temp += "  ";
		}
	}
}
