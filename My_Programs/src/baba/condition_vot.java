package baba;

import java.util.Scanner;

public class condition_vot {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(18<=age)
		{
			System.out.println("you eligble for vote");
		}
		if(18>age)
		{
			System.out.println("you note ligble for vote");
		}
		else if(10<age)
		{
			System.out.println("you are children");
		}
	}

}
