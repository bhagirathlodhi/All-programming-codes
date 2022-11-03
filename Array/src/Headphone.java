
public class Headphone {
	String name,color;
	int price;
	Headphone(String n,String c,int p)
	{
		this.name=n;
		this.color=c;
		this.price=p;
	}
	void DisplayData()
	{
		System.out.println("name is:"+this.name+"\ncolor is:"+this.color+"\nprice is:"+this.price);
		System.out.println("");
	}

	public static void main(String[] args) {
		Headphone h=new Headphone("Syska", "black", 1999);
		Headphone h1=new Headphone("Realme","White",2222);
		Headphone h2=new Headphone("Ubon", "red", 999);
		Headphone arr[]= {h,h1,h2};
		for(int i=0;i<arr.length;i++)
		{
			arr[i].DisplayData();
		}

	}

}
