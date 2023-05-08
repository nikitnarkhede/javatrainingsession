package class_assignment;

import java.util.Scanner;

public class Vehicle {
	private String Vehicle_name;
	private String no_wheel;
	private String no_passenger;
	private String vehicle_type;
	public String getVehicle_name() {
		return Vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		Vehicle_name = vehicle_name;
	}
	public String getNo_wheel() {
		return no_wheel;
	}
	public void setNo_wheel(String no_wheel) {
		this.no_wheel = no_wheel;
	}
	public String getNo_passenger() {
		return no_passenger;
	}
	public void setNo_passenger(String no_passenger) {
		this.no_passenger = no_passenger;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	@Override
	public String toString() {
		return "Vehicle [Vehicle_name=" + Vehicle_name + ", no_wheel=" + no_wheel + ", no_passenger=" + no_passenger
				+ ", vehicle_type=" + vehicle_type + "]";
	}
}
