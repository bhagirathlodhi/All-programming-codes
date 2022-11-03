import java.util.Scanner;
public class Voat {
  public static void main(String[] args) {
	int n;
	System.out.println("Enter your ege");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n>18) {
		System.out.println("Your Eligible for Voat");
	}
	else
		System.out.println("Your not elegible for voat");
	
}
}
