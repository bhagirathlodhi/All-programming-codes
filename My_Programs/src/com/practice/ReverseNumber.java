package com.practice;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
       int number,r;
       System.out.println("Enter any number");
       Scanner num=new Scanner(System.in);
       number=num.nextInt();
       while(number>0)
       {
    	   r=number%10;
    	   System.out.print(r);
    	   number=number/10;
    			
       }
       
	}

}
