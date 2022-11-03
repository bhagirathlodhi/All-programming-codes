import java.util.Scanner;

public class Sort_Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st = sc.nextLine();
		int count = 0;
		for(int i=0;i<st.length();i++)
		{
			String str = st.toLowerCase();
			if(str.charAt(i)!='a'&& str.charAt(i)!='e'&& str.charAt(i)!='i'&& str.charAt(i)!='o'&& str.charAt(i)!='u')
			{
				count++;
			}
		}
		System.out.println(count+" consonant character present in the "+st);
	}
}
