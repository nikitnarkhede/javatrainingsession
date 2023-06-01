package employee1;

import java.util.ArrayList;

public interface EmployeeDirectory {
	
	public static final ArrayList<Employee> allEmployeeList = new ArrayList<Employee>();
	
	public void registerEmployee(Employee emp);
	public void getEmployee(int id);
	public void removeEmployee(int id);
	public void getAllEmployees();
	public void printAllEmployeeHierarchy();
	
	

}
