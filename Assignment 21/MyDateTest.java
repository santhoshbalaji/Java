class MyDateTest{
	public static void main (String args []){
		MyDate S = new MyDate();
		//System.out.println(S.tostring());
		MyDate S1 = new MyDate(1999,10,24);
		System.out.println(S1.getyear());
		S1.setdate(1998,12,4);
		System.out.println(S1.getyear());
		System.out.println(S1.getmonth());
		System.out.println(S1.getday());
		System.out.println(S1.tostring());
	}

}