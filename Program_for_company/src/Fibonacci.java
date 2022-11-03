import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int f1= 0,f2=1;
		while(n>0)
		{
			System.out.print(f1+" ");
			int f3 = f1+f2;
			f2=f1;
			f1=f3;
			n--;
			
			
		}
	}

}
