
public class Mobile {
	String name;
	int price;
	Mobile(String n,int p)
	{
		this.name=n;
		this.price=p;
	}

	public static void main(String[] args) {
		Mobile m=new Mobile("Moto", 17333);
		Mobile m1=new Mobile("Realme", 16999);
		Mobile m2=new Mobile("Oppo", 19999);
		Mobile mo[]= {m,m1,m2};
		System.out.println(mo.length);
		for(int a=0;a<mo.length;a++)
		{
//			System.out.println(mo[a]);
			System.out.println("Mobile name :-"+mo[a].name+", price is:-"+mo[a].price);
		}
		

	}

}
