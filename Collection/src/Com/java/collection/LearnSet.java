package Com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();
		set.add(45);
		set.add(555);
		set.add(45);
		set.add(22);
		set.add(21);
		System.out.println(set);
		set.add(22);
		set.remove(45);
		System.out.println(set);
		set.contains(22);
		System.out.println(set.contains(22));
		System.out.println(5+6+"sevan");
	}

}
