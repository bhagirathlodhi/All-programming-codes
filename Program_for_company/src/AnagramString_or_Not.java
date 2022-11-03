import java.util.Arrays;
import java.util.Scanner;

public class AnagramString_or_Not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st =sc.next();
		String str = sc.next();
		String rs= atringAnagram(st,str);
		System.out.println(rs);
	}
	private static String atringAnagram(String st, String str) 
	{
		char c[]=st.toCharArray();
		char cc[] = str.toCharArray();
		Arrays.sort(c);
		Arrays.sort(cc);
		if(c.length!=cc.length)
			return "Not Anagram";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==cc[i])
				return "Anagram";
		}
		return "not Anagram";	
	}
}
