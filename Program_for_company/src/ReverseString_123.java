import java.util.Scanner;

public class ReverseString_123 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any String :");
		String str = sc.next();
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--)//bhagirath
		{								 //012345678
			str1 = str1+str.charAt(i);
		}
		System.out.println("reverse string is :"+str1);
	}

}
