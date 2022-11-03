package Com.java.collection;

import java.util.*;


public class Employee {
	int id;
	String name;
	double sal;
	public Employee( String name, double sal) {
		super();
		Random rs =new Random();
		this.id = rs.nextInt();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", sal=" + sal;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("bhagi",12345.23);
		Employee e2=new Employee("bhagirath",16345.23);
		Employee e3=new Employee("Abhi",22345.23);
		Employee e4=new Employee("Multy",62345.23);
		Employee e5=new Employee("bhagi",12745.23);
		Comparator com=new Comparator()
		{
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1= (Employee) o1;
		Employee e2= (Employee) o2;
		Double s1= e1.sal;
		Double s2= e2.sal;
		return -s1.compareTo(s2);
	}
};

		ArrayList<Employee> li = new ArrayList<Employee>();
		li.add(e1);li.add(e2);li.add(e3);li.add(e4);li.add(e5);
		li.sort(com);
		ListIterator it=li.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
		
	}
}
