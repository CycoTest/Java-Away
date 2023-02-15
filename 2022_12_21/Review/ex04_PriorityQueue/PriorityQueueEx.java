package ex04_PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(4);
		pq.offer(2);
		
		System.out.println(pq);
		
		Object obj = null;
		
		while ((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
	}
}
