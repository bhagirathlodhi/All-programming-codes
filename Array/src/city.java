
public class city {

	public static void main(String[] args) {
    String city[]= {"Bangalore","Bhopal","kanpur","Delhi","Raypur","Indore"};
    System.out.println(city.length);
    System.out.println("farward direction");
    for(int i=0;i<city.length;i++)
    {
    	System.out.println(city[i]);
    }
    System.out.println("Backward direction");
    
    for(int i=city.length-1;i>=0;i--)
    {
    	System.out.println(city[i]);
    }
	}

}
