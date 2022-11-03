import java.util.Scanner;

public class Less0Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				count++;
		}
		System.out.println(count);
	}

}
