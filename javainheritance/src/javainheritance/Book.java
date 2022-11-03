package javainheritance;

public class Book {
	void WriteBook(String Tittle,String Writer)
	{
		   System.out.println("Book Tittle is:"+Tittle+"\nBook Writer :"+Writer);
	}
	void WiteBook(String Tittle,int price)
	{
		System.out.println("Tittle is: "+Tittle+"\nBook price is :"+price+"\n");
	}

	public static void main(String[] args) {
        Book b=new Book();
        b.WiteBook("Story", 400);
        b.WriteBook("Lacture", "Ramesh");
     
	}

}
