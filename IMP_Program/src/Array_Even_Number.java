import java.util.Scanner;

public class Array_Even_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array-->");
		int n=sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter"+n+" integer element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println("Even number are-->");
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				System.out.print(ar[i]+" ");
				
		}
	}
	

}
