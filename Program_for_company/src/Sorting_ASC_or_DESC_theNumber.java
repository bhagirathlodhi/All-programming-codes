
public class Sorting_ASC_or_DESC_theNumber {
	
	public static void main(String[] args) {
		int n=125638746;
		int r,temp;
		for(int i=9;i>=0;i--)
		{
			temp=n;
			while(temp!=0)
			{
				r=temp%10;
				if(i==r)
					System.out.print(r+" ");
				temp= temp/10;
			}
			
		}
	}

}
