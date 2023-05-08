package class_assignment;

import java.util.Scanner;

public class Vehicle_main {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String vehicle_name = sc.next();
			String no_wheel = sc.next();
			String no_passenger = sc.next();
			String vehicle_type = sc.next();
			
			Vehicle vobj = new Vehicle();
			
			vobj.setVehicle_name(vehicle_name);
			vobj.setNo_wheel(no_wheel);
			
			vobj.setNo_passenger(no_passenger);
			vobj.setVehicle_type(vehicle_type);
			
			String Details = vobj.toString();
			System.out.print(Details);
			
			
		}
		
	}

