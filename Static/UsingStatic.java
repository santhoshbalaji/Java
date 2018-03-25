class UsingStatic{
	int a,b;
	static int cnt;
	static{
		System.out.println("static block called");
	}
	public UsingStatic(){
		a = 100;
		b = 200;
		cnt++;
	}
	public static void main(String[] args) {
		//System.out.println(UsingStatic.cnt);
		UsingStatic obj = new UsingStatic();
		UsingStatic obj1 = new UsingStatic();
		UsingStatic obj2 = new UsingStatic();
		//System.out.println(cnt);
		System.out.println(obj.cnt);
		System.out.println(obj1.cnt);
		System.out.println(obj2.cnt);
		hello();
		obj.hello();
		obj1.hello();
		UsingStatic.hello();
		obj.bye();
	}
	public static void hello(){
		System.out.println("hello");
	}
	public void bye(){
		System.out.println("bye");
		bye2();
	}
	public void bye2(){
		System.out.println("bye2");	
	}
}
