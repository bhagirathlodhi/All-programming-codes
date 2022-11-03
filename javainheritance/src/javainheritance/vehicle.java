package javainheritance;

public class vehicle {
	String name;
	int price;
	void StartEngine()
	{
		System.out.println("Start-Engine");
	}
	

	

	}


class Bike extends vehicle {
	
	
	void m2()
	{
		System.out.println("Bike class");
	}
	 public static void main(String[] args) {
		Bike b1=new Bike();
		b1.name="Honda";
		b1.price=347883;
		System.out.println(b1.name+" "+b1.price);
		b1.StartEngine();
	}
	
}
class Car extends Bike {
	public static void main(String[] args) {
	
		Car c1=new Car();
		c1.m2();
		c1.name="Hero";
		c1.price=347003;
		System.out.println(c1.name+" "+c1.price);
		c1.StartEngine();
	}
}
