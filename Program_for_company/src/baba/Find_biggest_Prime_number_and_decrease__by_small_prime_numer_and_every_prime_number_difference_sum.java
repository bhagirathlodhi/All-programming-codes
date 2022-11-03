package baba;

import java.util.*;
public class Find_biggest_Prime_number_and_decrease__by_small_prime_numer_and_every_prime_number_difference_sum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size....");
		int size = sc.nextInt();
		int ar[] = new int[size];
		System.out.println("enter "+size+" integer elements");
		for(int i = 0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		ArrayList<Integer> a =new ArrayList<Integer>();
		for(int i = ar[0];i<ar[1];i++)
		{
			for(int j = 2;j<ar[1];j++)
			{
				if(isprime(i))
					a.add(i);
				break;
			}
		}
	Object c[]= a.toArray();
	int max= Collections.max(a);
	int sum = 0;
	for(int i = 0;i<a.size();i++)
	{
		sum = sum+(max-a.get(i));
	}
	System.out.println(sum);
	}
	static boolean isprime(int n)
	{ 
		for(int i = 2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
			return true;
	}
}//11 13 17 19 21 23 27 29 //4+6+8+10+14