package collectionFramework;
import java.util.*;
public class learnCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		
		
		System.out.println("min element: "+Collections.min(lst));
		System.out.println("max element: "+Collections.max(lst));
		System.out.println("frequency : "+Collections.frequency(lst,3));
		Collections.sort(lst,Comparator.reverseOrder());
		System.out.println(lst);
		
		
		List<student> list=new ArrayList<student>();
		list.add(new student("omkar",50));
		list.add(new student("devesh",41));
		list.add(new student("kshitj",19));
		list.add(new student("chairanya",04));
		
		student s1=new student("omkar",1);
		student s2=new student("devesh",2);
		System.out.println(s1.compareTo(s2));
		
		Collections.sort(list);
		
	}

}
