package Java_8_Features;

public interface Default_Method {
	public void horn();
	
	public default void speed()
	{
		System.out.println(" speed is 150 kph");
	}
	public default void Color(String VehicleName,String clr) {
		System.out.println(VehicleName+" color is :"+clr);
		
	}

}
