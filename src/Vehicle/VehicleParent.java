package Vehicle;

public class VehicleParent {
protected String name;
protected String regnumber;
public VehicleParent(String name,String regnumber) {
	this.name=name;
	this.regnumber=regnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRegnumber() {
	return regnumber;
}
public void setRegnumber(String regnumber) {
	this.regnumber = regnumber;
}

public void PrintSummary() {
	System.out.println(name+""+regnumber);
}

}
