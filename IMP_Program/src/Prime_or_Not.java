import java.util.Scanner;

public class Prime_or_Not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Any number--->");
		int number = sc.nextInt();
		boolean prime = isPrime(number);
		if(prime)
			System.out.println(number+" Is Prime...");
		else
			System.out.println(number+" is not prime");
	}

	private static boolean isPrime(int number) {
		for(int i = 2;i<number/2;i++)
		{
			if(number%i==0)
				return false;
			
		}
		return true;
	}

}
