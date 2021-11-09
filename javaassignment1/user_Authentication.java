package javaassignments;
import java.util.Scanner;
public class user_Authentication 
	{
	   public static void results(int attempts)
	    {
	        String username,password;
	        Scanner sc =new Scanner(System.in);
	        System.out.print("Enter username:" );//username:user
	        username = sc.nextLine();
	        System.out.print("Enter password:" );//password:user
	        password = sc.nextLine();
	        if((username.equals("nani123")) && (password.equals("1234")))
	        {
	            System.out.println("welcome "+username);
	        }
	        else
	        {
	            System.out.println("Authentication Failed");
	            attempts++;
	            {
	           if(attempts==3) {System.out.println("contact admin");
	           return;}}
	           results(attempts);
	            
	        }
	    } public static void main(String args[]) {
	   int attempts;
	   results(0);
	}}

