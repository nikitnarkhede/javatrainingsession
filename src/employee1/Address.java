package employee1;

public class Address {
	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	private String buildingName;
	private String streetName;
	private String city;
	private String state;
	private int pincode;
	
	public Address(String buildingName, String streetName, String city, String state, int pincode) {
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


}
