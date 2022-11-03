import java.util.Scanner;
public class Number1 {
	public static void main(String[] args) {
		int a,b,out;
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		out = (a>b) ? a:b;
		System.out.println("Greater number is b = "+out);
		
	}

}
