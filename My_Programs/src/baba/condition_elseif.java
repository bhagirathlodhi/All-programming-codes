package baba;
import java.util.Scanner;
public class condition_elseif {

	public static void main(String[] args) {
		int marks;
		System.out.println("Enter your marks:");
		Scanner m=new Scanner(System.in);
		marks=m.nextInt();
        if(marks>=60 && marks<=100) 
        {
        	System.out.println("congress..Your are first division");
        }	
        else if(marks>=50 && marks<=59)
        {
        	System.out.println("congress..Your are second division");
        }
        else if(marks>=33 && marks<=49)
        {
        	System.out.println("congress..Your are third division");
        }
        else
        {
        	System.out.println("ohhh.....You are fail");
        }
	}

}
