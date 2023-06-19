package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class learnLinkedListQueue {

	public static void main(String[] args) {
		/*
		 * Queue- FIFO
		 */
		
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(50);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.peek());
	}

}
