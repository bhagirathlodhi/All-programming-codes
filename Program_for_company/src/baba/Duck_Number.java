package baba;

import java.util.Scanner;

public class Duck_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();//056
		int temp= n;
		int sub = 1;
		 n = n/10;
		
		while(n>0)
		{
			sub = sub*10;
			n = n/10;
			
		}	
		int r = temp/sub;
		System.out.println(sub);
		if(r==0)
			System.out.println("this is not duck number");
		else
			System.out.println("this is  duck number");
	}

}
