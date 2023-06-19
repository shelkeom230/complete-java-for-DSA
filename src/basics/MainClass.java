package basics;

import encapsulation.*;

public class MainClass {

	public static void main(String[] args) {
		
		// System.out.println("hello world");
		
        // Person p1=new Person();
        // p1.name="omkar";
        // p1.age=18;
		
        // System.out.println(p1.name+" "+p1.age);
        // p1.walk(2);
		
		
//        Person p2=new Person(18,"kshitij hadke");
//        // p2.name="devesh";
//        // p2.age=19;
//        System.out.println(p2.name+" "+p2.age);
//        p2.eat();
		
//        System.out.println(Person.count);
//       Developer d1=new Developer(22,"mm bhai");
//
//        d1.eat();
//        d1.walk();
//        d1.walk(2);
//        d1.doWorking(); 
//        
//        Developer d2=new Developer(20,"gotya bhau");
//        d2.eat();
//        d2.walk();
//        d2.walk(2);
//        d2.doWorking();
		
//		EncapsulationIntro obj=new EncapsulationIntro();
//		obj.doWork();
		
		Audi a1=new Audi();
		a1.start();
		
		BMW b1=new BMW();
		b1.start();
	}
}

class Developer extends Person{
    public Developer(int age,String name){
        super(age,name);
    }
    public void walk(){
        System.out.println("developer "+name+" is walking");
    }
}
class Person{
    // properties 
    protected String name;
    int age;
    static int count;

    public Person(){
        count++;
        System.out.println("creating an object");
    }

    public Person(int age,String name){
        this();
        this.name=name;
        this.age=age;
    }
    public void walk(){
        System.out.println(name+" is walking");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void walk(int steps){
        System.out.println(name+" walked "+steps+" steps .");
    }
    public void doWorking(){
        System.out.println(name+" is working");
    }
}
class Audi extends Car{
	void start() {
		System.out.println("Audi is starting.");
	}
}
class BMW extends Car{
	void start() {
		System.out.println("BMW is starting.");
	}
}
abstract class Car{ //we cannot create the object now.
	int price;
	
	abstract void start();
}