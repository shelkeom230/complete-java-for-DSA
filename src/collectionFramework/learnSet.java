package collectionFramework;

import java.util.*;

public class learnSet {

	public static void main(String[] args) {
//		no duplicats 
//		Set<Integer> set=new HashSet<Integer>();
//		Set<Integer> set=new LinkedHashSet<Integer>();
//		Set<Integer> set=new TreeSet<Integer>(); //0(logn)
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
////		set.add(40);
//		
//		
//		System.out.println(set);
//		set.remove(40);
//		System.out.println(set);
//		
//		System.out.println(set.contains(10));
//		
//		System.out.println(set.isEmpty());
//		
//		System.out.println(set.size());
//		
//		
//		set.clear();
//		System.out.println(set);
		
		Set<student> studentSet=new HashSet<student>();
		studentSet.add(new student("omkar",50));
		studentSet.add(new student("devesh",41));
		studentSet.add(new student("karan",49));
		studentSet.add(new student("rohit",50));
		
		System.out.println(studentSet);
		
	}

}
