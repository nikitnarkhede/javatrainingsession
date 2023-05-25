package Car_Thread;



public class Car extends Thread {
	
	public Car(String name) {
		setName(name);
	}
	public void run() {
		
		System.out.println("Car "+getName()+" reached Destination");
	}
}
