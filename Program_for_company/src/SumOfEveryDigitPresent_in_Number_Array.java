import java.util.Scanner;

public class SumOfEveryDigitPresent_in_Number_Array {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
	arr[i]=sc.nextInt();
	}
	int length=arr.length;
	for(int i=0;i<length;i++)
	{
	int a=arr[i]%10;
	int b=arr[i]/10;
	arr[i]=a+b;
	}
	for(int i: arr){
	System.out.print(i+" ");
	}
	}
}
