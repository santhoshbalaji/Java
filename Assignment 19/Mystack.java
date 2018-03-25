class Mystack{
	private int maxsize;
	private long contents[];
	private int tos;

	public Mystack(int maxsize){
		this.maxsize = maxsize;
		contents = new long[maxsize];
		this.tos = -1;
	}
	public void push(long data){
		tos++;
		contents[tos] = data;
	}
	public long pop(){
		return contents[tos--];
	}
	public long peek(){
		return contents[tos];
	}
	public boolean isEmpty(){
		if(tos == -1){
			return true;
		}
		else
			return false;
	}
	public boolean isFull(){
		if(tos == maxsize-1){
			return true;
		}
		else
			return false;
	}
	public String toString(){
		String temp = "";
		for (int i = 0;i <= tos; i++){
			temp += contents[i]+" ";
		}
		return temp;
	}

}