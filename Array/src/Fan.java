
public class Fan extends Interface01 {
	public static void main(String[] args) {
		Fan f=new Fan();
		f.name="Usha";f.color="White";f.price=1800;
		System.out.println("Fan name is "+f.name+"\nFan color is "+f.color+"\nFan price is "+f.price);
		f.switchOn();
		f.switchOff();
		f.increaseSpeed();
		f.decreaseSpeed();
	}

}
