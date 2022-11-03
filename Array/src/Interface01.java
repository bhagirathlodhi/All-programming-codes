
public class Interface01 implements Iswitch,Iregulator {
		String name,color;
		int price;
		@Override
		public void increaseSpeed()
		{
			System.out.println("increaseSpeed");
			
		}
		@Override
		public void decreaseSpeed()
		{
			System.out.println("decreaseSpeed");
		}
		public void switchOn()
		{
			System.out.println("switch on");
		}
		public void switchOff()
		{
			System.out.println("switch off");
			
		}
}
