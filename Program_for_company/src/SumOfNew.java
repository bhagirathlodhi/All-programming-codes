import java.util.Scanner;

public class SumOfNew {
	static int sum(int[] arr)
    {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++)
            sum = sum+ arr[i];
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n= sc.nextInt();
	    int ar[]= new int[n];
	    for(int i=0;i<ar.length;i++)
	    {
	        ar[i]=sc.nextInt();
	    }
	        System.out.println( sum(ar));
	}
}
