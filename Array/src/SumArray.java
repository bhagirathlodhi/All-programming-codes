import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int n = sc.nextInt();
		  int v[]= sumOfoddEven(n);
		 if(v[0]==v[1])
		   System.out.println("pass");
		else
		  System.out.println("fail");
		 
		}
		static int[] sumOfoddEven(int n)
		{ 
		    int sum[]= new int[2];
	 while(n!=0)
		{
		 int r=n%10;
		if(r%2!=0)
		   sum[1] = sum[1]+r;
		else
		sum[0]= sum[0]+r;
		n = n/10;
		}
	 return sum;
		}
	}


