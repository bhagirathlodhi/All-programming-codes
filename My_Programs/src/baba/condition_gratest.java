package baba;
import java.util.Scanner;
public class condition_gratest {
public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter any number");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if(a>b && a>c)
	{
		System.out.println("a--is grater "+a);
	}
	 else if(b>a && b>c)
	{
		System.out.println("b--is grater "+b);
	}
	else
	{
		System.out.println("c--is grater "+c);
	}
		
//	if(a<b && a<c)
//		System.out.println(a+"is smallest");
//	
//	else if(b<a && b<c)
//		System.out.println(b+" is smallest");
//	else
//		System.out.println(c+" is smallest");
}
}
