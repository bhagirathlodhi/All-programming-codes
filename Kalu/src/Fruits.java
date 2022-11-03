
public class Fruits {
	String color;    //Common Properties
	int price;       //Common Behavior
	void BuyFruits() //Method 1
	{
		System.out.println(" I buy the fruits");
	}
	void EatFruits() // Method 2
	{
		System.out.println("i eat the fruits");
	}

	public static void main(String[] args) {
		Fruits f=new Fruits();// Constructor call
		f.color="Green";      //Properties Initilization
		f.price=90;
		System.out.println(f.color+"\n "+f.price);
		f.BuyFruits();
		f.EatFruits();// Method call

	}

}
