import java.util.Scanner;

public class Palindrome_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=sc.nextInt();
		int sub=0,temp=n;
		while(n>0)
		{
			int r=n%10;
			sub = (sub*10)+r;
			n=n/10;
		}
		
		if(temp==sub)
			System.out.println(temp+" is palindrome");
		else
			System.out.println(temp+" is not palindro");
	}

}
