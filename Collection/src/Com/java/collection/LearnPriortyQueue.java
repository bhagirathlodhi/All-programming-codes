package Com.java.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriortyQueue {
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(4);
		pq.offer(45);
		pq.offer(465);
		pq.offer(788);
		pq.offer(452);
		System.out.println(pq);
		System.out.println(pq.poll());
	}

}
