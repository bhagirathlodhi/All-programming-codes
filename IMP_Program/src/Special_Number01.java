import java.util.Scanner;

public class Special_Number01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter any number...");
		
		int n = sc.nextInt();//145
		int fact= 1,sum = 0;
		while(n>0)
		{
			int d = n%10;
			do {
				sum =fact*d;
				d--;
			}while(d!=0);
			
		
	
		}
		}

}
