package baba;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
		String st = str[0];
		int c = 0;
		for(int i=0;i<str.length;i++)
		{
			if(str[0]==str[i])
			c++;	
		}
		System.out.println(c);
	
	}

	

}
