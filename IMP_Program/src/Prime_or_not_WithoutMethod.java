import java.util.Scanner;

public class Prime_or_not_WithoutMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number....");
		int n=sc.nextInt();
		int conut=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				conut++;
		}
		if(conut==2)
			System.out.println(" is prime");
		else 
			System.out.println(" not prime");
		
	}

}
