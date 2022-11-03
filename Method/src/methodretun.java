
 class methodretun {
	
	String Beg(String name,String brand,int price)
	{
		System.out.println(name+" "+brand+" "+price);
		return name;
	}
	public static void main(String[] args) {
		methodretun m=new methodretun();
		String x=m.Beg("puma","india",88);
		System.out.println(x);
		
	}

}
