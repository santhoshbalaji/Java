class Cylinder extends Circle{
	private double height;
	//private double volume;
	public Cylinder(){
	this.height=1.0;
	}
public  Cylinder(double height){
	this.height=height;
}
public Cylinder(double height,double radius){
	this.height=height;
	this.radius=radius;
}
public Cylinder(double height,double radius,String color){
	this.height=height;
	this.radius=radius;
	this.color=color;
}
public double getHeight(){
	return this.height;
}
public void setHeight(double height){
	this.height=height;
}
public double getVolume(){
	return getArea()*height;
}
public String toString(){
	return "Cylinder";
}
}
