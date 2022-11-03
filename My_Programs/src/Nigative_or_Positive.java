import java.util.Scanner;
public class Nigative_or_Positive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A number");
		int number = input.nextInt();
		String num = (number>0)?"postive":"negative";
		System.out.println(num);

	}

}
