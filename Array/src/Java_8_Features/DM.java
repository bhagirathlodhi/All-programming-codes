package Java_8_Features;

import java.util.Scanner;

public class DM {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n = sc.nextInt();
			String sr = Winner(n);
			System.out.println(sr);
				
	}

		private static String Winner(int n) {
			int last = n%10;
			int lasts = (n/10)%10;
			int sum  = last+lasts;
			if(sum==3||sum==8)
				return "Lucky Draw winner";
			else
				return "Not a Lucky Draw winner";
		}

}
