package Thread;

public class Car extends Thread {
	
	public MyCar(String name) {
		setName(name);
		
	}
	public void run() {
		
		System.out.println("Car"+getName()+"reached Destination");
	}
}
