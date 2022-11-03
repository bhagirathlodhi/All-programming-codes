package baba;
import java.util.Scanner;
public class Primeornot {
	public static void main(String[] args) {
		int n,count=0;
		System.out.println("enter any number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if (count==2)
			System.out.println("this is prime number");
		else
			System.out.println("this is not prime number");
	}

}
