public class Sorting{
	public static void main(String args[]){
		int x[] = {35,8,72,69,10};
		int temp;
		for (int i = 1; i <= 2; i++){
			for (int j = 0; j < x.length-i; j++){
				if( x[j] > x[j+1]){
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					System.out.println("Swapped "+x[i]+" "+x[j+1]);
				}
			}
		}
		System.out.println("The sorted value is ");
		for(int k = 0; k < 5; k++){
			System.out.print(x[k]+" ");
		}
		System.out.println();
	}
}
