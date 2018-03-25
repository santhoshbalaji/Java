import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class UsingFile{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("errorinjava.txt"));
		while (scan.hasNext()){
			System.out.println(scan.nextLine());
		}
	}
}