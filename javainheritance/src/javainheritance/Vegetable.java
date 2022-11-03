package javainheritance;

public class Vegetable {
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
class Potato extends Vegetable {
	public static void main(String[] args) {
		Potato p=new Potato();
		
	}
}

class Tomato extends Vegetable
{
	public static void main(String[] args) {
		Tomato t = new Tomato();
		System.out.println(t.color ="Red");
		System.out.println(t.price=43);
	}
}