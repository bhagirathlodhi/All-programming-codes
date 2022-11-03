package baba;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int gcd = gcdNumber(n,m);
		System.out.println(gcd);
	}
	private static int gcdNumber(int n, int m) {
		return n%m==0?m:gcdNumber(m,n%m);
	}

}
