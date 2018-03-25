class Mystacktest{
	public static void main(String[] args) {
		Mystack newcontent = new Mystack(5);
		for(int i = 0; i < 5; i++){
			newcontent.push(12+i);
		}
		System.out.println(newcontent.pop());
		System.out.println(newcontent.peek());
		System.out.println(newcontent.toString());
	}
}