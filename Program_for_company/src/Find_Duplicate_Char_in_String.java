import java.util.Scanner;

public class Find_Duplicate_Char_in_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
		char st = str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==st)
				System.out.println(str.charAt(i));
			st++;
		}
	}

}
//abcdfjgerj