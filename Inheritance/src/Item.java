
public class Item {
	String name;
	String brand;
	int price;
	private Item()
	{
		System.out.println("this is constructor");
	}
	void BuyItem()
	{
		System.out.println("Buy a item box");
	}
	void ShiftItem()
	{
		System.out.println("Shifted Item");
	}

	public static void main(String[] args) {
		Item i=new Item();
		i.BuyItem();
		i.ShiftItem();
		i.name="Abhay";
		i.brand="Standared";
		i.price=5677;
		System.out.println(i.name+" \n"+i.brand+"\n "+i.price);

	}

}
