import java.util.Scanner;

public class String_change_lower_Upper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Lower/Upper:");
		String str = sc.next();
		for(int i=0;i<str.length();i++)
		{
			int ch = str.charAt(i);
			if(ch>64&&ch<96)
			{
				ch=ch+32;
				System.out.print((char)ch);
			}
			else if(ch>96&&ch<123)
			{
				ch=ch-32;
				System.out.print((char)ch);
			}
			if(ch==32)
			{
				System.out.println(" ");
			}
		}
		System.out.println();
		
	}

}
