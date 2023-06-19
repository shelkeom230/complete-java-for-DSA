package collectionFramework;
import java.util.*;

public class collectionsFrameworks {

	public static void main(String[] args) {
//		String[] studentName=new String[31];
//		studentName[0]="omkar";
//		
//		studentName[30]="devesh";
		
//		ArrayList<String> studentName=new ArrayList<String>();
		
//		size now-n after adding 1 element
//		n+n/2+1
//		studentName.add("omkar");
//		studentName.add("devesh");
//		studentName.add("kshitij");
//		System.out.println(studentName);
//		studentName.add("anuj");
//		System.out.println(studentName);
//		
//		ArrayList<Integer> list1=new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		
//		ArrayList<Integer> list2=new ArrayList<Integer>();
//		list2.add(5);
//		list2.add(6);
//		list2.add(7);
//		
//		list1.addAll(list2);
//		System.out.println(list1);
		
////		get the element 
//		System.out.println(list1.get(1));
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(90);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove(Integer.valueOf(30));
		System.out.println(list);
		
//		list.clear();
//		System.out.println(list);
//		time complexity- 0(n)
		
//		set function 
		list.set(2, 50);
		System.out.println(list);
		
//		contains function 
		System.out.println(list.contains(500));
		
//		traverse the elements 
		for(int i=0;i<list.size();i++) {
			System.out.println("The element is: "+list.get(i));
		}
		
		for(Integer element: list) {
			System.out.println("The element is: "+element);
		}
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println("iterator: "+it.next());
		}
		
	}

}
