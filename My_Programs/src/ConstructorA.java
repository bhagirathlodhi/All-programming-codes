
public class ConstructorA {
	String name;
	String model;
	int price;
	ConstructorA(String n,String m,int p)
	{
		this.name=n;
		this.model=m;
		this.price=p;
	}	
	void ConstructorA()
	{
		System.out.println("name is"+this.name+"\nmodel is"+this.model+"\nprice is:"+this.price);
		System.out.println("");
	}
	int Display()
	{

		System.out.println("name is"+this.name+"\nmodel is"+this.model+"\nprice is:"+this.price);
		System.out.println("");
		return price;
	}

	public static void main(String[] args) {
		ConstructorA c=new ConstructorA("Puma","india",399);
		System.out.println("name is"+c.name+"\nmodel is"+c.model+"\nprice is:"+c.price);
		System.out.println("");
		c.ConstructorA();
		int x=c.Display();
		System.out.println(x);
		

	}

}
