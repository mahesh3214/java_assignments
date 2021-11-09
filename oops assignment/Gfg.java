package javaassignments;

class singleton {
	
	    private static singleton single_instance = null;
	    public String s;
	    private singleton()
	    {
	        s = "Hello I am a string part of Singleton class";
	    }
	 
	    
	    public static singleton singleton()
	    {
	        if (single_instance == null) {
	            single_instance = new singleton();
	        }
	        return single_instance;
	    }
	}
	 

	public class Gfg {
		   
	    public static void main(String args[])
	    {
	        singleton x = singleton.singleton();
	 
	        singleton y = singleton.singleton();
	 
	        singleton z = singleton.singleton();
	 
	        x.s = (x.s).toUpperCase();

	        System.out.println("String from x is " + x.s);
	        System.out.println("String from y is " + y.s);
	        System.out.println("String from z is " + z.s);
	        System.out.println("\n");
	 
	        z.s = (z.s).toLowerCase();
	 
	        System.out.println("String from x is " + x.s);
	        System.out.println("String from y is " + y.s);
	        System.out.println("String from z is " + z.s);
	    }
	}

