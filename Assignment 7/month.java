/*.
Store months of a year using an 2 dimensional Array initializer {month,daysinthatmonth}
. 
String months[][]={{"jan","30"},{"feb","28"},{"mar","31"},{"apr","30"}};
Get the month of birth of the user and display the month name and number of days in that 
month.(Not considering leap year calculations)
Enter your month of birth 
jan 
Jan has 30 days 
Enter your month of birth 
FEB 
Feb has 28 days 
Enter your month of birth 
Oct 
October has 31 days */
import java.util.Scanner;
class month{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String months[][] = {{"jan","31"},{"feb","28"},{"mar","31"},{"apr","30"},{"may","31"},{"jun","30"},{"jul","31"},{"aug","31"},{"sep","30"},{"oct","31"},{"nov","30"},{"dec","31"}};
		System.out.println("Enter your month of birth");
		String month = input.next();
		for (int i = 0; i < months.length; i++ ){
			if(month.equals(months[i][0])){
				System.out.println(months[i][0]+" has "+months[i][1]);
			}
		}
	}
}
