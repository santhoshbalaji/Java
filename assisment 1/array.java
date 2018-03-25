class array{
	public static void main(String args[]){
		String days[] = {"h","e","l","l","o","w","o","r","l","d"};
		for(int index = 0; index<days.length; index++){
			for(int j = 0; j <= index; j++){
				System.out.print(days[j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
