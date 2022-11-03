
//Creat a array integer type add 7 data print the all the data accept one and two data

public class arr1 {
	public static void main(String[] args) {
		int a[]= {45,25,63,78,45,96,35};
		String r[]= {"munna","bhagi","dev","abhi","amit","ballu"};
		double d[]= {12.0,454.56,568.3,465.000,8.123,56.21,45.45,36.23};
		String s[]= {"56","89","324","bh","rt","gh"};
		System.out.println(a.length);
		System.out.println("");
		for(int i=1;i<6;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Last two element");
		for(int i=4;i<r.length;i++)
		{
			System.out.println(r[i]);
		}
		System.out.println("accept stating two and last two element");
		for(int i=2;i<6;i++)
		{
			System.out.println(d[i]);
		}
		System.out.println("forward direction");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("Back ward directon");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		
	}

}
