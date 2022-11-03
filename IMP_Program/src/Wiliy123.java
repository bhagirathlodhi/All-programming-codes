import java.util.Scanner;

public class Wiliy123 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int ar1[]=printFib(n);
		int pr[] = isPrime(n);
		Display(ar1);
		System.out.println();
		System.out.println("next array");
		Display(pr);
		System.out.println("merge array");
		int cr[]= MergeArray(ar1,pr);
		Display(cr);
		}
	
	private static void Display(int[] ar1) {
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
			
		}
	}
	static int[] printFib(int n)
	{  
		int ar[] = new int[n];
		int i = 0;
		int f1=0,f2=1;
		while(n>0)
		{
			ar[i]= f1;
			int f3 = f1+f2;//1
			f1 = f2;//1
			f2 = f3;//2
			n--;
			i++;
		}
		return ar;
	}
	public static int[] isPrime(int n)
	{
		int i,x=2,a=0;
		int rr[] =new int[n];
		while(n>0)
		{
			for(i=2;i<x;i++)
				if(x%i==0)
					break;
			if(i==x)
			{
//				System.out.println(x+" ");
				rr[a]=x;
				n--;
				a++;
			}
			x++;
		}
		return rr;
	}
	private static int[] MergeArray(int[] a, int[] b) {
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i]=a[j];
				if(b[i]==0||b[i]==1||b[i]==2||b[i]==3||b[i]==4||b[i]==5)
					c[i]=b[i];
			}
		}
		
		return c;
	}
}//2 0 3 1 7 1 
