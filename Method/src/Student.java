//Method Overloading
public class Student {
	void Student(String name,int rollnumber,int marks)
	{
		System.out.println("name is:"+name+"\nRollnumber is:"+rollnumber+"\nmarks is :"+marks);
		
	}
	void Student(String name,String branch,int roll)
	{
		System.out.println("name is:"+name+"\nbranch is:"+branch+"\nRollnumber  is :"+roll);
	}
	void Display(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.Student("Bhagirath", 171003, 500);
		s.Student("Munna","Computer Science", 562);
		s.Display(45, 23);
	}

}
