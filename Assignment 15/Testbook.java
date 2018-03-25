class Testbook{
	public static void main(String args[]){
		Author a = new Author("santhosh","santhosh7676@gmail.com",'m');
		Book b = new Book ("ceaser" ,a, 123, 500);
		System.out.println(b.getAuthorname());
		
	}
}
