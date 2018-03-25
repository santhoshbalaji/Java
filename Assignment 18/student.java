class student extends Person{
	String program;
	int year;
	double fee;
	public student(){

	}
	public student(String name,String address,String program,int year,double fee){
		this.name = name;
		this.address = address;
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram(){
		return this.program;
	}
	public void setProgram(String program){
		this.program = program;
	}
	public int getYear(){
		return this.year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public double getFee(){
		return this.fee;
	}
	public void setYear(double fee){
		this.fee = fee;
	}
	public String toString(){
		return "Student[Person[name = "+this.name+",address = "+this.address+",program = "+this.program+",year = "+this.year+",fee = "+this.fee+"]]";
	}
}