import java.util.Scanner;
	public class Student_bhagi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int num[] = new int[size];
		for(int i=0;i<num.length;i++)
		{
			num[i] = input.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>=91&&num[i]<=100)
				System.out.println("S");
			else if(num[i]>=81&&num[i]<=90)
				System.out.println("A");
			else if(num[i]>=71&&num[i]<=80)
				System.out.println("B+");
			else if(num[i]>=61&&num[i]<=70)
				System.out.println("B");
			else if(num[i]>=51&&num[i]<=60)
				System.out.println("C");
			else if(num[i]>=41&&num[i]<=50)
				System.out.println("D");
			else if(num[i]>=0&&num[i]<=40)
				System.out.println("U");
			else
				System.out.println("invalid input");
			
		}
	}
}
