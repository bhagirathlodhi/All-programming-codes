import java.util.Scanner;

public class Arra_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new  int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=30 && ar[i]<=50)
				System.out.print(ar[i]+" ");
		}
	}

}
