class Cylinder {
		
	 private int height,radius;
	 
	 public Cylinder(){
	// System.out.println("Construtor called");
	 height=100;
	radius=20;
	 }
	 public Cylinder(int h){
	 height = h;
	 }
	  public Cylinder(int h,int r){
	 height = h;
	 radius = r;
	 }
	 public double surface_area (){
	    return (2(3.14)radius*(radius+height));
	 }
	 public double volume (){
	    return (3.14(radius*radius)*height);
	 }
	 public void int getheight (){
	    return height;
	 }
	 public void int getradius (){
	    return radius;
	 }
	 public setHeight(int h)
	 {   height=h;
	 	return h;
	 }	
	  public setRadius(int r)
	 {   radius=r;
	 	return r;
	 }
	 
	 public setHeightRadius(int h,int r)
	 {height=h;   
	 radius=r;
	 }
	 
	 public String toString(){
	   return "height = "+height+"radius"+radius;
	 }	  
	 
	 }
class Cylindertest {
	public static void main (String agrs[]){
	
	 
	
	Cylinder r = new Cylinder();
	Cylinder s = new Cylinder(10,20);
	
	System.out.println(r.getheight()+" "+r.getradius());
	System.out.println(r.volume());
	
	//System.out.println(r.height+" "+s.radius);
	//System.out.println(r.surface_area());
	
	//System.out.println(r.getheight());
	//System.out.println(r.getradius());
	
	//r.setheight(1000);
	//System.out.println(r.getheight());
	//r.setBreath(400);
	//System.out.println(r.getradius());
	
	r.setHeightRadius(103434,24540);
	//System.out.println(r.setheightBreath());
	
	System.out.println(r);
	
	
	
	
	}
}
	

