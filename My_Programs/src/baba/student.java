package baba;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
    int pwd;
    System.out.println("Enter your passwor:");
    Scanner s=new Scanner(System.in);
    
    pwd=s.nextInt();
    if(pwd==898989)
    {
    	System.out.println("Name - bhagirath");
    	System.out.println("Address-Bhopal");
    	System.out.println("Mobile no-6260940563");


    }
    else
    {
    	System.out.println("Wring password ..");
    	System.out.println("            Try again ..");
    }
    
	}

}
