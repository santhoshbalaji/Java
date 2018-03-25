class factorial{
	public static void main(String args[]){
		int limit = 10;
		int factorial = 1;
		for (long i = 1; i <= limit; i++){
			for (long factor = 2; factor <= i; factor++){
				factorial *= factor;
			}
			System.out.println(i + "! is " + factorial);
		}
	}
}
