package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] kuchbhi) {
		Laptop l1=new Laptop();
//		l1.price=23;
		l1.setPrice(40);
		l1.getPrice();
		l1.setRam(8);
		System.out.println(l1.getRam());
		
	}
	public void doWork() {
		System.out.println("I am working remotely.");
	}

}

class Laptop{
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	int ram;
	int price;
	
	public void setPrice(int price) {
//		is the user admin 
		boolean isAdmin=false;
		if(!isAdmin) {
			System.out.println("You cannot set the price.");
		}else {
		this.price=price;
		}
	}
	public void getPrice() {
		System.out.println("The price of apple macbook air m1 is : "+price+" dollars.");
	}
}
