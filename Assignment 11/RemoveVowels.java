/*5.
Set up a String array of the following musical instruments: 
cello 
guitar 
violin 
veena 
piano 
double bass 
Loop round and remove the vowels.  Output would look like : 
cll 
gtr 
vln 
vn 
pn 
dbl bss */
public class RemoveVowels{
	public static void main(String args[]){
		String[] name = {"cello","guitar","violin","veena"."piano","double bass"};
		String[] vowels = {"a","e","i","o","u"};
		for (int i = 0; i < name.length; i++){
			String temp = name[i];
			for(int j = 0; j < temp.length; j++){
				if((temp.index(j)).equals(vowels[j])){
					continue;
				}
				System.out.print(temp[j]);
			}
			System.out.println(" ");
		}
	}
}
