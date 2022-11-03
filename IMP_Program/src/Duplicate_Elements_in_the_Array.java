import java.util.Scanner;

public class Duplicate_Elements_in_the_Array {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size :");
		int size =sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter "+size+" array elements :");
		int len =a.length;
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
				for(int j=(i+1);j<len;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
		}
		
	}

}
