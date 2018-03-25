interface I1{
	public void hello();
}
interface I2 extends I1{
	public void bye();
	public void print();
}
class X implements I2{
	public void hello(){
		System.out.println("hello");
	}
	public void bye(){
		System.out.println("bye");
	}
	public void print(){
		System.out.println("print");
	}
	public X(){
		hello();
		bye();
		print();
	}
	public static void main(String[] args) {
		X x = new X();
		System.out.println(x);
	}
}
