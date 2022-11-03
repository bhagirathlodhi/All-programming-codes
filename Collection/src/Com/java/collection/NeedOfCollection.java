package Com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NeedOfCollection {

	public static void main(String[] args) {
//		ArrayList<String> studentName = new ArrayList<>();
//		studentName.add("bhagirath");
//		studentName.add("Sachin");
//		studentName.add("Deepak");
//		studentName.add("Shashank");
//		for(String s:studentName)
//		{
//			System.out.println(s);
//		}
		List<Integer> run=new ArrayList();
		run.add(45);
		run.add(56);
		run.add(23);
		run.add(56);
		run.add(78);
		run.add(12);
		run.add(1, 11);
//		System.out.println(run);
//		System.out.println(run.get(0));
//		run.remove(2);
//		System.out.println(run);
//		//run.clear();
//		System.out.println(run);
//		run.set(2, 1000);
//		System.out.println(run);
//		System.out.println(run.contains(100));
//		for(Integer el:run)
//		{
//			System.out.println("for each element is"+el);
//		}
		Iterator<Integer> it =run.iterator();
//		while(it.hasNext())
//		{
//			System.out.println("iterator is "+it.next());
//		}
		
		
	}

}
