package com.practice;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
       int n,c,s=0,r;
       System.out.println("enter any number");
       Scanner ref=new Scanner(System.in);
       n=ref.nextInt();
       c=n;
       while(n>0)
       {
    	   r=n%10;
    	   s=s*10+r;
    	   n=n/10;
    	   
       }
       if(c==s)
    	   System.out.println("palindrome number");
       else
    	   System.out.println("not palindrome");
	}

}
