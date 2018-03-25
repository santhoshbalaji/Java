class staff extends Person{
	String school;
	double pay;
	public staff(){

	}
	public staff(String name,String address,String school,double pay){
		this.name = name;
		this.address = address;
		this.school =  school;
		this.pay = pay;
	}
	public String getSchool(){
		return this.school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public double getPay(){
		return this.pay;
	}
	public void setPay(double pay){
		this.pay = pay;
	}
	public String toString(){
		return "Staff[Person[name = "+this.name+",address = "+this.address+",school = "+this.school+",pay = "+this.pay+"]]";
	}
}