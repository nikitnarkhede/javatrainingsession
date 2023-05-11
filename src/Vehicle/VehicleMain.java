package Vehicle;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name  = sc.next();
		String regnumber= sc.next();
		int load=sc.nextInt();
		
		Bus b = new Bus(name,regnumber,load);
		
		b.PrintSummary();
	}

}
