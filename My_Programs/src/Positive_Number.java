import java.util.Scanner;
public class Positive_Number {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		if(num<0)
		{
			num=num*-1;
			
		}
		System.out.println(num);
	}
}
