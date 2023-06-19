package basics;

public class interfaces implements cars,persons{
	public static void main(String[] args) {
		interfaces i1=new interfaces();
		i1.walk();
		i1.start();
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("person is walking.");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car is starting.");
	}
}

interface cars{
	void start();
}

interface persons{
	void walk();
}
