class Robot{  
    int xlocation;  
    int ylocation;  
    String name;  
    static ccount = 0;  
    public Robot(int xxlocation, int yylocation, String nname) {  
   	    xlocation = xxlocation;  
        ylocation = yylocation;  
        name = nname;  
        ccount++;
        return ccount;         
    }
}
class JavaApplication1 { 
	public static void main(String[] args) {  
    	robot firstRobot = new Robot(34,51,"yossi");  
        System.out.println("number of robots is now " + Robot.ccount); 
        System.out.println(firstRobot.toString);
    }
}