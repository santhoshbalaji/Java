class rectangletest extends rectangle{
	public rectangletest(){
		System.out.println("hi");
	}
	public String toString(){
		return "hi";
	}
	public static void main(String args[]) throws ClassNotFoundException{
			rectangle r = new rectangle();
			Class cls = rectangletest.class;
			//rectangle s = new rectangle(10,20);
			//System.out.println(r.length+r.breath);
			//System.out.println(s.length+" "+s.breath);
			r.setlengthbreath(10,20);
			System.out.println(cls.getSuperclass());
			Class n = Class.forName("rectangletest");
			System.out.println(n.toString());
	}
}
