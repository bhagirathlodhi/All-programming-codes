
public class Item {
String name;
int price;
 void BuyItem(String n,int p)
 {
	 this.name=n;
	 this.price=p;
	 System.out.println(this.name+this.price);
	 
 }
public static void main(String[] args) {
	Item i=new Item();
	i.BuyItem("Badsheet", 999);
	System.out.println(i.name+"\n"+i.price);
	
}
}
