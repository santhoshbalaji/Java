public class Book{
	private String name;
	private Author authorinfo;
	private double price;
	private int qty;
	//Author a = new Author("santhosh","santhosh7676@gmail.com",'m');
	public Book(String name, Author authorinfo, double price){
		this.name = name;
		this.authorinfo = authorinfo;
		this.price = price;
	}
	public Book(String name,Author authorinfo,double price,int qty){
		this.name = name;
		this.authorinfo = authorinfo;
		this.price = price;
		this.qty = qty;
	}
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return authorinfo;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public int getQty(){
		return qty;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public String toString(){
		String temp = "Book[name = "+name+" "+authorinfo+", price = "+price+", qty = "+qty+"]";
		return temp;
	}	
	public String getAuthorname(){
		return authorinfo.getName();
	}
	public String getAuthoremail(){
		return authorinfo.getEmail();
	}
	public char getAuthorgender(){
		return authorinfo.getGender();
	}
}

