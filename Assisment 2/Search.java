/*2.Find & Replace:  Use a sorted array, search for an array element using Linear Search and replace every occurrence of it with a -10.*/
public class Search{
	public static void main(String args[]){
		int a[] = {2,3,4,5,6,7,8};
		int search = 4;
		int replace = -10;
		for(int i = 0; i < 7; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < a.length; i++){
			if(a[i] == search){
				a[i] = replace;
			}
		}
		for(int i = 0; i < 7; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

