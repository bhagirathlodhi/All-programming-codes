import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int [n];
	System.out.println("Enter array elements");
	for(int i=0;i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("reversed arry is");
	for(int i=a.length-1; i>=0; i--)
	{
		System.out.print(a[i]+" ");
	}
	}

}
