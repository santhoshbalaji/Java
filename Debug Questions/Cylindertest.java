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
