class SplitMethod{
	public static void main(String args[]){
		String results = "ManchesterUnited 1 Chelsea 0, Arsenal 1 ManchesterUnited 1, ManchesterUnited 3 Fulham 1, Liverpool 2 ManchesterUnited 1, Swansea 2 ManchesterUnited 4"; 
		String result[] =results.split("\\s"); 
		
		for (int i = 0; i < 5; i++){
			System.out.println(result[i]);
		}
		
	}
}
