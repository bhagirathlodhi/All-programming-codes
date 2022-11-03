package Java_8_Features;

import java.util.Scanner;

public class Com {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array-->");
		int n=sc.nextInt();
		String ar[] = new String[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.next();
		}
//	for(int i=0;i<ar.length;i++)
//	{
//		System.out.println(ar[i]);
//	}
	int count = 0;
	for(int i=0;i<ar.length;i++)
	{
		if (ar[i]=="a"||ar[i]=="e"||ar[i]=="i" ||ar[i]=="o" ||ar[i]=="u")
			count++;
	}
	System.out.print(count+" ");
	}
	

}
