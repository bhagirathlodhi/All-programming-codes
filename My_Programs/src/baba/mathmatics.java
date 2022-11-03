package baba;

public class mathmatics {
	int a=12;
	int b=23;
	mathmatics ()         //constructor
	{
		System.out.println("mathmatics Opreation");
	}
	int add()
	{
		return a-b;
	}
	int mul()
	{
		return a*b;
	}
	double div()
	{
		return b/a;
	}

	public static void main(String[] args) {
		mathmatics m1= new mathmatics();
		System.out.println("division "+""+m1.div());
		
		
	}

}
