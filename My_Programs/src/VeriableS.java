
public class VeriableS {
	int x=100;
	void display()
	{
		System.out.println(x);
	}
	void display1()
	{
		int x=900;
		System.out.println("medhod 1"+x);
	}

	public static void main(String[] args) {
		VeriableS n=new VeriableS();
		n.display();
		n.display1();
	}

}
