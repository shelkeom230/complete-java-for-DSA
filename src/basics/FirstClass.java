package basics;

import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
//		System.out.println("Hello World\nI am Omkar Shelke");
	
		/*Data types: 
		 *int,float,char,String,long,boolean
		 */
//		int age=18;
		/*
		 * variable name can only contain alphanumeric chars, alphabets and digits.
		 *  signs allowed: underscore(_), dollar($), sign($)
		 */
		/*
		float avgMarks=94.30f;
		char name='A';
		String fullName="omkar shelke";
		long bigNumber=123456; //range of long- 2^18
		boolean isTrue=true;
		*/
		
//		System.out.println(isTrue);
		
		/*
		 * operators
		 * 1. arithmatic:
		 * +,-,*,/,%,++,--
		 */
//		int firstNumber=10;
//		int secondNumber=50;
//		int result=firstNumber-secondNumber;
//		double divide=(double)firstNumber/(double)secondNumber;
//		int remainder=firstNumber%secondNumber;
//		System.out.println(result);
//		System.out.println(divide);
//		System.out.println(remainder);
		
//		int a=12;
//		post increment 
//		System.out.println(a++);
//		System.out.println(a);
		
//		pre increment 
//		System.out.println(++a);
//		System.out.println(a);
		
//		user input 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter your name: ");
//		String name=sc.nextLine();
//		System.out.println("enter your age: ");
//		int num=sc.nextInt();
//		System.out.println(name);
//		System.out.println(num);
		
		/*relational operators
		 *>,<,>=,<=,!=
		 */
//		System.out.println(19!=18);
		
//		conditional statements 
//		int age=18;
//		if(age>18) {
//			System.out.println("you can vote");
//		}else {
//			System.out.println("you can not vote");
//		}
		
//		char grade='A';
//		if(grade=='A') {
//			System.out.println("very good");
//		}else if(grade=='B') {
//			System.out.println("good, keep learning");
//		}else if(grade=='D') {
//			System.out.println("skills matter, not your marks, keep on learning");
//		}else {
//			System.out.println("invalid grade");
//		}
		
		
//		switch case 
		/*
		char grade='D';
		switch (grade){
		case 'A': System.out.println("very good.");
		break;
		case 'B':System.out.println("good, keep learning");
		break;
		case 'D': System.out.println("skills matter, not your marks, keep on improving");
		break;
		default: System.out.println("invalid grade");
		}	 
		*/
		
//		logical operators:  and,or,not &&,||,!
		
//		loops:  for,white,do-while
//		1. for loop 
//		for(int i=1;i<10;i++) {
//			System.out.println("omkar"+" "+i);
//		}
		
//		2. while loop is used when number of iterations is unknown 
//		int num=23;
//		while(num<100) {
//			num++;
//			if (num==65) continue;
//			System.out.println(num);
//		}
		
//		3. do-while loop 
//		int no=23;
//		do {
//			System.out.println(no);
//			no++;
//		}while(no<100);
		
//		Arrays 
//		store marks of 5 students 
//		int marks[]=new int[5];
//		marks[0]=95;
//		marks[1]=99;
//		marks[2]=90;
//		marks[3]=89;
//		marks[4]=50;
		
//		method 2 
//		int marks[]= {1,2,3,4,5};
//		for(int i=0;i<marks.length;i++) {
//			System.out.println("marks of subject "+i+" is: "+marks[i]);
//		}
		
//		2d array 
//		int a[][]=new int[2][3];
//		int a[][]= {{1,2},{2,3}};
//		System.out.println(a[0][0]);
		
//		methods or functions 
//		syntax- returntype functionName(args)
//		System.out.println(average(10,11));
//		System.out.println(average(94,97));
		
//		exception handling 
//		int a[]=new int[3];
//		try {
//			System.out.println(a[4]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("kuch error aagaya bidu");
//		}finally {
//			System.out.println("done");
//		}
	}
	static int average(int firstNum,int secondNum) {
		return (firstNum+secondNum)/2;
	}
}