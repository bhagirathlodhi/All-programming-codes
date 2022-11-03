import java.util.Scanner;
public class Solution 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String[] inp = str.split(",");
		
		System.out.println(isSpecial(inp,inp.length));
	}
	
	public static int isSpecial(String[] inp, int inpSize) 
	{
		int arr[] = new int[inp.length];
		for(int i=0;i<inpSize;i++) 
		{
			arr[i] = Integer.parseInt(inp[i]);
		}
		
		int spclCount = 0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=1;j<((arr[i]/2)+1);j++) 
			{
				if(j+getReverse(j) == arr[i]) 
				{
					spclCount++;
					break;
				}
			}
		}
		
		return spclCount;
	}
	
	public static int getReverse(int n) 
	{
		int rem,rev=0;
		while(n != 0)
		{
			rem = n % 10;
			rev = (rev*10) + rem;
			n /= 10;
		}
		return rev;
	}

}