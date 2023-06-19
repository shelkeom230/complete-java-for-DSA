package collectionFramework;

import java.util.Stack;

public class learnStack {

	public static void main(String[] args) {
		/*
		 * LIFO, FILO
		 */
		Stack<String> animals=new Stack<String>();
		animals.push("lion");
		animals.push("tiger");
		animals.push("horse");
		animals.push("cat");
		
		System.out.println("Stack elements: "+animals);
		System.out.println(animals.peek());

		animals.pop();
		
		System.out.println(animals.peek());


	}

}
