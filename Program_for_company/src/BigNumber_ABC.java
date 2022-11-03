import java.util.Scanner;

public class BigNumber_ABC {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(a>b&&a>c)?a:(b>c&&b>c)?b:c;
		System.out.println("Big number is :"+d);
	}

}
