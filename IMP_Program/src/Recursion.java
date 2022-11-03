
public class Recursion {
	public static void main(String[] args) {
		Display(3);
	}

	private static void  Display(int i) {
		if(i>1)
			Display(i-1);
		System.out.println(i);
	}
}
