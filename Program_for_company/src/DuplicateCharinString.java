import java.util.Scanner;

public class DuplicateCharinString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
		int a=str.length();
		char c[] = str.toCharArray();
		
		for(int i = 0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
					System.out.print(c[i]+" ");
			}
		}
	}

}
