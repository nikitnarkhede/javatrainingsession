package Vehicle;

public class Bus extends VehicleParent{
	private int noOfPassenger;
	public Bus(String name,String regnumber,int noOfPassenger)
	{
		super(name,regnumber);
		this.noOfPassenger= noOfPassenger; 
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	@Override
	public void PrintSummary() {
		System.out.println(name+""+regnumber+""+noOfPassenger);
	}


}
