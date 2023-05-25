package Car_Runnable;

public class CarRunnableImp {
	public static void main(String args[]) {
		
		CarRunnable  CC1 = new CarRunnable("C1");
		CarRunnable CC2 = new CarRunnable("C2");
		CarRunnable CC3 = new CarRunnable("C3");
		CarRunnable CC4 = new CarRunnable("C4");
		
		Thread C1 = new Thread(CC1);
		Thread C2 = new Thread(CC2);
		Thread C3 = new Thread(CC3);
		Thread C4 = new Thread(CC1);
		
		
		C1.start();
		C2.start();
		C3.start();
		C4.start();
	}
}
