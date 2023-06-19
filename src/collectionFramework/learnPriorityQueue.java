package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class learnPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		pq.offer(12);
		pq.offer(100);
		pq.offer(50);
		pq.offer(60);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		

	}

}
