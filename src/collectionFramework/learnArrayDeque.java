package collectionFramework;

import java.util.ArrayDeque;

public class learnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		adq.offerFirst(12);
		adq.offer(23);
		adq.offer(50);
		adq.offer(40);
		adq.offerLast(60);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());
		System.out.println("poll: "+adq);
		
		System.out.println(adq.pollFirst());
		System.out.println("pollFirst() "+adq);
		
		System.out.println(adq.pollLast());
		System.out.println("pollLast() "+adq);
	}

}
