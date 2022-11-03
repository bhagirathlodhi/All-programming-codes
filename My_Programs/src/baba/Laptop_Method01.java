package baba;// Write a Program to creat a method and calling by object

public class Laptop_Method01 {
	String name,brand,ram,rom;
	int price;
	void Laptop_Method01()
	{
		System.out.println("name is :-"+this.name+"\nbrand is:-"+this.brand+"\nram is :-"+this.ram+"\nrom is :-"+this.rom+"\nprice is :-"+this.price);
		
	}
	

	public static void main(String[] args) {
		Laptop_Method01 l=new Laptop_Method01();
		l.name="hp";l.brand="Android";l.ram="8gb";l.rom="1TB";l.price=89562;
		l.Laptop_Method01();
		

	}

}
