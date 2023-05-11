package Vehicle;

public class Truck extends VehicleParent{
	private int load;
	public Truck(String name,String regnumber,int load)
	{
		super(name,regnumber);
		this.load=load;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}
	@Override
	public void PrintSummary() {
		System.out.println(name+""+regnumber+""+load);
	}


}
