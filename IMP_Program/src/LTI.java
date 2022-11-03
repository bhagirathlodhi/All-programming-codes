import java.util.Scanner;

public class LTI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the arra element:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			//System.out.println(ar[i]);
		}
		int rs  = rev(ar);
    System.out.println(rs);
}

	private static int rev(int[] ar) {
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				count++;
		}
		return count;
	}
}
