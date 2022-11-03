import java.util.Scanner;
public class Equal_Not {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = input.nextInt();
		int number1 = input.nextInt();
		if(number==number1)//equals();
		 System.out.println("number is equal");
		else
			System.out.println("number is not equal");
	}

}
