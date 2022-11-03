import java.util.Scanner;

public class Missing_Number_in_the_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size  =sc.nextInt();
		int arr [] =new int[size];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();//1 2 3 5 =
		int sum1=0;
		for(int i=0;i<arr.length;i++)
			sum1 = sum1+arr[i];
		int sum2=0;
		for(int i=0;i<=arr.length+1;i++)
			sum2 = sum2+i;
		System.out.println("Missing number is :"+(sum2-sum1));
		int ac=sum2-sum1;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=ac)
				System.out.println(i);
		}
			
	}
	

}
