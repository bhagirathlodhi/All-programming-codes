package javainheritance;

public class Vegeta {
	String color;
	int price;
	void washVegetable()
	{
		System.out.println("wash-Vegetable");
	}
	void cutVegetable()
	{
		System.out.println("cut-vegetable");
	}		
		
	}
class Potat extends Vegeta {
	public static void main(String[] args) {
		Potat p=new Potat();
		
	}
}

class Tomat extends Vegeta
{
	public static void main(String[] args) {
		Tomato t = new Tomato();
		System.out.println(t.color ="Red");
		System.out.println(t.price=43);
	}
}