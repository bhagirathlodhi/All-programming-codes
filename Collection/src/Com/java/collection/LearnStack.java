package Com.java.collection;

import java.util.Stack;

public class LearnStack {
	public static void main(String[] args) {
		Stack<String> name =new Stack<>();
		name.push("bhagiath");
		name.push("deepak");
		name.push("Abhay");
		name.push("Shashank");
		name.push("Abhilash");
		System.out.println(" Stack"+name);
		System.out.println(name.pop());
		System.out.println(name);
		System.out.println(name.peek());
		System.out.println(name.pop());
		System.out.println(name);
	}

}
