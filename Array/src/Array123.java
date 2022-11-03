
public class Array123 {
	private Array123(int id,String s)
	{
		System.out.println("this is private constructor");
	}
	Array123(int a)
	{ 
		System.out.println("this is 123 constructor");
	}
	public static void main(String[] args) {
		Array123 n=new Array123(12,"this");
		Array123 e=new Array123(123,"hii");
	}
	
	

}
