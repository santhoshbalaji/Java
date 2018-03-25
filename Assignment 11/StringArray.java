/*3.Set up an array to hold the following string values: 
Beyonce (f) 
David Bowie (m) 
Elvis Costello (m) 
Madonna (f) 
Elton John (m) 
Charles Aznavour (m) 
Write a program to loop round and count how many are male vocalists and how many are female */
public class StringArray{
	public static void main(String args[]){
		String[] name = {"Beyonce (f)","David Bowie (m)","Elvis Costello (m)","Madonna (f)","Elton John (m)","Charles Aznavour (m)"};
		int i = 0,count = 0,count1 = 0;
		while (i < name.length){
			System.out.println(name[i]);
			if(name[i].endsWith("(f)")){
				count++;
				
			}
			else if(name[i].endsWith("(m)")){
				count1++;
			}
			i++;
		}
		System.out.print("The number of males:"+count1);
		System.out.print("The number of females:"+count);
		System.out.println();
	}
}
