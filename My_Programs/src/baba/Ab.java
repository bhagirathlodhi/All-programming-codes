/* Explain a static variable  */
package baba;

public class Ab {
	int a=8;
	static int b=12;

	public static void main(String[] args) {
		Ab ob1=new Ab();
		System.out.println(ob1.a);//8
		System.out.println(ob1.b);//12
		ob1.a=78;
		ob1.b=200;
		System.out.println(ob1.a);//78
		System.out.println(ob1.b);//200
		Ab ob2=new Ab();
		System.out.println(ob2.a);//8
		System.out.println(ob2.b);//200

	}

}
