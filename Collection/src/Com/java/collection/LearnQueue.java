package Com.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
	public static void main(String[] args) {
		
	
	Queue<Integer> qu = new LinkedList<>();
	qu.offer(56);
	qu.add(56);
	qu.offer(568);
	qu.offer(13);
	System.out.println(qu);
	System.out.println(qu.poll());
	System.out.println(qu.peek());
	System.out.println(qu.poll());
	System.out.println();
	
}
}
