/* Hetrogeneuos array*/
 class demo {
 String model,color;
 int price;
// public static void main(String[] args) {
//	System.out.println("hii ");
//}
 @Override
 public String toString()
 {
	 return "model is:"+this.model+"\ncolor is:"+this.color+"\nprice is:"+this.price;
 }
 
}
class oppo extends demo
{
	
}
class Realme extends demo
{
	
}
class onepluse extends demo
{
	
}
class H_Mobile
{
	public static void main(String[] args) {
		oppo o=new oppo();
		o.model="pro";o.color="black";o.price=15891;
		Realme r=new Realme();
		r.model="5i";r.color="red";r.price=12000;
		onepluse e=new onepluse();
		e.model="12t";e.color="white";e.price=19999;
		demo x[]= {o,r,e};
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
				
	}
}