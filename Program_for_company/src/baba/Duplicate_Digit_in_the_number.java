package baba;

import java.util.Scanner;

public class Duplicate_Digit_in_the_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
//		System.out.println("which number to search...");
//		int fn = sc.nextInt();
		int count= 0 ,duplicateNumber=0;
		while(n!=0)
		{
			int r=n%10;
			int fn=r;
			if(r==fn)
			{
				count++;
				duplicateNumber=r;
			}
			n=n/10;
		}
		if(count==0)
			System.out.println("Digit is not present");
		else
			System.out.println("digit "+duplicateNumber+" "+count+" time present in the number");
	}

}
