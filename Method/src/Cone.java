
public class Cone {
	double area( float r)
	{
		return ((1.0/3.0)*3.14*r*r*r);
	}
    public static void main(String[] args) {
		Cone c=new Cone();
		double x=c.area(5);
		System.out.println(" Area is "+x);
	}
}
