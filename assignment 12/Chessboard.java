class chessboard{
	public static void main(String args[]){
		String[][] checker = new String[8][8];
		//System.out.println(checker.length);
		for (int i = 0; i < checker.length; i++){
			for (int j = 0; j < checker.length; j++){
				checker[i][j] = "white-";
				
				if(j%2 != 0 && i%2 == 0){
					checker[i][j] = "black-";
				}
				if(i%2 != 0 && j%2 == 0){
					checker[i][j] = "black-"; 
				}
				System.out.print(checker[i][j]);	
			}
			System.out.println();
		}
	}
}
