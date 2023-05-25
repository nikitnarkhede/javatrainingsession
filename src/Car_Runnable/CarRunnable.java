package Car_Runnable;

public class CarRunnable implements Runnable {
private String name;

	
	public CarRunnable(String name) {
	
	this.name = name;
}


	@Override
	public void run() {
		System.out.println("Car "+name+" reached Destination");
		
	}

}
