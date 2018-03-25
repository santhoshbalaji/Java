class rectangle{
	private int length,breath = 2;
	public rectangle(){
		System.out.println("constructor called");
		length = 100;
	}
	/*public rectangle(int l){
		length = l;
	} 
	public rectangle(int l,int b){
		length = l;
		breath = b;
	}*/
	public int area (){
		return (length*breath);
	}
	public int perimeter(){
		return (2*(length + breath));
	}
	public int getlength(){
		return length;
	}
	public int getbreath(){
		return breath;
	}
	public void setlengthbreath(int l){
		length = l;
	}
	public void setbreath(int b){
		breath = b;
	}
	public int getlengthbreath(){
		return length + breath;
	}
	public void setlengthbreath(int l, int b){
		length = l;
		breath = b;
	}
	public String toString(){
		return "length = "+length+" breath = "+breath;
	}
}
