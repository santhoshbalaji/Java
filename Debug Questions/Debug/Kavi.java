import java.util.Array;
class PhoneBook{
	private int name;
	private String number;
public PhoneBook(String name,String number){
	this.name = name;
	this.number = number;
}
public String getName(){
	return name;
	}
public String setName(String name){
	this.name=name;
	}
public String setNumber(String number){
	this.number=number;
	}
public String tostring(){
	return "PhoneBook [Name = " + name + " , Number = " + number + "]";
	}
public static void main(String a[]){ 
	PhoneBook book = new PhoneBook("kavi",9965785461);
	PhoneBook book1 = new PhoneBook("kruthi",8073517600);
	PhoneBook book2 = new PhoneBook("surya",9003251371);
	PhoneBook book3 = new PhoneBook("prabu",9962706123);
	PhoneBook book4 = new PhoneBook("sandy",7708362349);
	Array<PhoneBook> Entry = new Array<>();
	PhoneBook.add(book);
	PhoneBook.add(book1);
	PhoneBook.add(book2);
	PhoneBook.add(book3);
	System.out.println(Entry);
}
}


	
	
	
