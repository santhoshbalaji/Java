abstract class AbstractExample{
	public void print(){
		System.out.println("hello");
	}
	abstract public void hello();
	abstract public void bye();
}
class a extends AbstractExample{
	public void hello(){
		System.out.println("hello");
	}
	public void bye(){
		System.out.println("bye");
	}
	public a(){
		hello();
		bye();
	}
	public static void main(String[] args) {
		a ab = new a();
		System.out.println(ab);
	}
}