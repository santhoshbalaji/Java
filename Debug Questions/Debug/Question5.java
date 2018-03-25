import java.util.ArrayList;
 public class Question5{
 	  ArrayList <String>bench1;
 	  ArrayList <String>bench2;
 	  ArrayList <String>bench3;
 	  ArrayList <String>bench4;
 	  ArrayList <ArrayList<String>> seating;

	public Question5() {
		bench1  = new ArrayList(Arrays.asList("Aero","Sindhu"));
		bench2 = new ArrayList(Arrays.asList("Sangeetha","Aarthi","Reshma"));
		bench3 = new ArrayList(Arrays.asList("Surya","Vicky","Nagaraj","Santhosh"));
		bench4 = new ArrayList(Arrays.asList("Venky","Vishal","tamiZH"));
		seating = new ArrayList<>();
	}
	public static void Seating(){
		seating.add(bench1);
		seating.add(bench2);
		seating.add(bench3);
		seating.add(bench4);
		

	}
	public String toString(){
		return Seating;	 
	}
	
	public static void main(String[] args) {
		Question5 R = new Question5();
		System.out.println(obj.toString);
		 	
	}
}
