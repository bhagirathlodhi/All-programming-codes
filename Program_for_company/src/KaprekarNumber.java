import java.util.Scanner;

public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number");
		int sqr,sum=0,temp,sub=1,rem=0,dev=0;
		int num = sc.nextInt();
		sqr=num*num;
		temp=num;
			while(num!=0)
			{
				sub = sub*10;
				num = num/10;
			}
		System.out.println(sub);
		rem = sqr%sub;
		dev = sqr/sub;
		sum = rem+dev;
	
		if(sum==temp)
			//System.out.println("kaprekar");
			System.out.println("yes");
		else if(temp<0)// it is optional 
			//System.out.println("not kaprekar");
			System.out.println("-1");
		else
			System.out.println("no");
		
		
	}

}
