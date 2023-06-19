package collectionFramework;

import java.util.Arrays;

public class learnArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,23,4,5,6,7};
		int index=Arrays.binarySearch(numbers, 4);
		System.out.println("the index of element 4 is: "+index);
		Arrays.sort(numbers);
		
		Arrays.fill(numbers, 12);
		for(int i:numbers) {
			System.out.println(i+" ");
		}

	}

}
