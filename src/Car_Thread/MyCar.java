package Car_Thread;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car C1 = new Car("C1");
		Car C2 = new Car("C2");
		Car C3 = new Car("C3");
		Car C4 = new Car("C4");
		C1.start();
		C2.start();
		C3.start();
		C4.start();
	}

}
