package javaassignments;

public class Contact {
 
	long phonenumber;
	String name;
	String email;
	private Contact.Gender gen;
	enum Gender{male,female,other}
	public Contact(long phonenumber,String name,String email,Gender gen) {
		this.phonenumber=phonenumber;
		this.name=name;
		this.email=email;
		this.gen=gen;
	}
	
	public String toString() {
		return "Contact[phonenumber="+phonenumber+",name="+name+",email="+email+",gen="+gen+"]"; }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

