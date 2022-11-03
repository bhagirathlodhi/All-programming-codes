import java.util.Scanner;

public class Big_Number_ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big =a;
		if(big<a)
			big=a;
		if(big<b)
			big=b;
		if(big<c)
			big=c;
		System.out.println(" big is "+big);
	}

}
