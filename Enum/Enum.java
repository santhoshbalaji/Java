import java.util.Scanner;
enum Weekdays{
	11,22,33,44,55;
}
class Enum{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int favday = obj.nextInt();
		Weekdays days;
		days = Weekdays.valueOf(favday);
		//for(Weekdays wd:Weekdays.values() ){
			switch(days){
				case 11:System.out.println("morning blues");break;
				case 22:System.out.println("boring");break;
				case 33:System.out.println("Super Lunch");break;
				case 44:System.out.println("Weekend approaching");break;
				case 55:System.out.println("Weekend begins");break;
			}
		//}		
	}
}