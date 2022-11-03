package baba;

public class First_N_prime_number {
	public static void main(String[] args) {
		int  n = 10,r=2,i;
		while(n>0)
		{
			for( i=2;i<r;i++)
			{
				if(r%i==0)
					break;
			}
			if(i==r)
			{
				System.out.println(r);
				n--;
			}
				
			r++;
		}
	}
}
