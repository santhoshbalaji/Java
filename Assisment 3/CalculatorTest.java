import java.util.Scanner;
public class CalculatorTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers and operator:");
		int one = input.nextInt();
		int two = input.nextInt();
		String OP = input.next();
		Calculator c = new Calculator();
		Calculator c1 = new Calculator(one,two);
		c.setnum1(10);
		c.setnum2(110);
		c1.setop(OP);
		//System.out.println(c.getnum2());
		String exp = c1.Calculation();
		String result = eval(exp);
		System.out.println(result);

	}
}
