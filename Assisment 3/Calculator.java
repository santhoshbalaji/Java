public class Calculator{
	int num1, num2;
	String op;
	public String Calculation(){
		return (num1+""+op+""+num2);
	}
	public int getnum1(){
		return num1;
	}
	public int getnum2(){
		return num2;
	}	
	public String getop(){
		return op;
	}
	public void setnum1(int numa){
		num1 = numa;
	}
	public void setnum2(int numb){
		num2 = numb;
	}
	public void setop(String opa){
		op = opa;
	}
	public void setnum1num2(int numa , int numb){
		num1 = numa;
		num2 = numb;
	}
	public Calculator(){
		//System.out.println("Calculator");
	}
	public Calculator(int a,int b){
		num1 = a;
		num2 = b;
	}
	 
}
