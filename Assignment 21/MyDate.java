class MyDate{
	int year,month,day;
	static String Months[] = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec","avolo than"};
	static String days[] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	static int daysinmonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	public MyDate(){

	}
	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setdate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getyear(){
		return this.year;
	}
	public int getmonth(){
		return this.month;
	}
	public int getday(){
		return this.day;
	}
	public void setyear(int year){
		this.year = year;
	}
	public void setmonth(int month){
		this.month = month;
	}	
	public void setday(int day){
		this.day = day;
	}
	public static boolean isLeapYear(int year){
		if(year % 4 == 0 && year % 100 != 0){
			daysinmonth[1] = 29;	
			return true;
		}
		else
			daysinmonth[1] = 28;
			return false;

	}
	public static boolean isValidDate(int year , int month , int  day ){
		if(year<=9999){	
			isLeapYear(year);
			if(month <= 12 && month != 0 && day != 0){
				int tempday = daysinmonth[month - 1];
				if(day<=tempday){
					return true;
				}
				else
					return false;
			}
			else
				return false;	
		}
		else
			return false;
	}
	public static String getDayofWeek(int year , int month , int day){
		int NonLY [] = {0,3,3,6,1,4,6,2,5,0,3,5};
		int cent [] = {6,4,2,0};
		boolean check =  isLeapYear(year);
		if(check){
			NonLY[0] = 6;
			NonLY[1] = 2;
		}
		int a,b;
		a = year/100; b = year%100;
		int temp = a%4;
		int S = (cent[temp]+b+b/4+NonLY[month-1]+day)%7;
		return days[S];


	}
	public MyDate nextDay(){
		int day = getday();
		int month = getmonth();
		int year = getyear();
		MyDate.isLeapYear(year);
		day++;
		if(MyDate.daysinmonth[month - 1] > (day)){
			MyDate Snew = new MyDate(year,month,day);
			return Snew;
		}
		else{
			day = 1;
			month++;
			if(month > 12){
				month = 1;
				year++;
			}
			MyDate Snew = new MyDate(year,month,day);
			return Snew;
		}	
	}
	public MyDate nextMonth(){
		month++;
		if(MyDate.isValidDate(year,month,day)){
			MyDate Snew = new MyDate(year,month,day);
			return Snew;
		}
		else{
			if(!(MyDate.daysinmonth[month-1] >= day)){
				day = MyDate.daysinmonth[month-1];				 
			}
			MyDate Snew1 = new MyDate(year,month,day);
			return Snew1;
		}
	}
	public MyDate nextYear(){
		if(MyDate.isValidDate(year,month,day)){
			if(month == 2){
				if(day == 29){
					day = 28;
				}
			}
		}
		year++;
		MyDate Snew1 = new MyDate(year,month,day);
		return Snew1;

	}
	public MyDate previousDay(){
		day--;
		System.out.println(day);
		if(MyDate.isValidDate(year,month,day)){
			MyDate Snew1 = new MyDate(year,month,day);
			return Snew1;
		}
		else{
			if(day == 0){
				month--;
				if(month == 0){
					  month = 12;
					  year--;
					  day = MyDate.daysinmonth[month - 1];
				}
				else{
					day = MyDate.daysinmonth[month - 1];
				}
			}
			MyDate Snew1 = new MyDate(year,month,day);
			return Snew1;
		}
	}
	public String toString(){
		return day+ " " + month+ " "+ year;
	}
	public static void main (String args []){
		MyDate S = new MyDate();
		//System.out.println(S.tostring());
		MyDate S1 = new MyDate(2020,10,24);
		MyDate S2 = new MyDate();
		//System.out.println(S1.getyear());
		S1.setdate(2020,1,1);
		//System.out.println("Get the Year"+S1.getyear());
		//System.out.println("Get the Month"+S1.getmonth());
		System.out.println(MyDate.isValidDate(S1.getyear(),S1.getmonth(),S1.getday()));
		//System.out.println(S1.toString());
		System.out.println(S1.previousDay());
		//System.out.println(S1.getDayofWeek(S1.getyear(),S1.getmonth(),S1.getday()));
		//System.out.println(S1.isLeapYear());
		//System.out.println(S1.isLeapYear(2016));
		//System.out.println(isValidDate(2020,2,28));
	}
}	