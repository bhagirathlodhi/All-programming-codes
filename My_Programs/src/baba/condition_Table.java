package baba;

import java.util.Scanner;

public class condition_Table {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+a+"="+i*a);
		}

	}

}