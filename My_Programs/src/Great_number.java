import java.util.Scanner;
public class Great_number {
  public static void main(String[] args) {
	System.out.println("Enter a number");
	int a,b,result;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	result=(a>b) ? a:b;
	System.out.println("number is greatest :"+result);
	
  }
}
	