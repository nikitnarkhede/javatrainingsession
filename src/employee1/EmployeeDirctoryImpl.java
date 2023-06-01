package employee1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDirctoryImpl implements EmployeeDirectory {

	ArrayList<Employee> listOfEmployee = new ArrayList<>();
	ArrayList<ArrayList<Employee>> hlistOfEmployee = new ArrayList<ArrayList<Employee>>();
	
	

	@Override
	public void registerEmployee(Employee emp) {
		 boolean checkManager = emp.isManager();
		 if(checkManager) {
			 
			 emp.setManager(emp);
			 listOfEmployee.add(emp);
			 
		 }
		 else {
			 listOfEmployee.add(emp);
		 }
	}

	@Override
	public void getEmployee(int i) {
		for(int j=0; j<listOfEmployee.size();j++) {
			if(listOfEmployee.get(j).getId()==i)
				System.out.println("ID: "+listOfEmployee.get(j).getId()+" Name: "+listOfEmployee.get(j).getName()+" Phone Number: "+listOfEmployee.get(j).getPhoneNumber()+" Address: "+listOfEmployee.get(j).getAddress());
		}
	}

	@Override
	public void removeEmployee(int id) {
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<listOfEmployee.size();j++) {
			
			if(listOfEmployee.get(j).isManager() && listOfEmployee.get(j).getId()==id) {
				System.out.println("You are deleting Employee who is manager please enter the Manager who is replacing");
				String name = sc.next();
				String deleteMnager = listOfEmployee.get(j).getName();
				System.out.println(listOfEmployee.get(j).getName()+" "+name+" "+ deleteMnager);
				listOfEmployee.remove(j);
				for(int k=0; k<listOfEmployee.size();k++) {
					System.out.println("insiiiiiiiii");
					if(listOfEmployee.get(k).getManagerName()==deleteMnager && (listOfEmployee.get(k).isManager()==false)) {
						
						listOfEmployee.get(k).setManagerName(name);
					}
					
				}
			}
			else if(listOfEmployee.get(j).getId()==id)
				listOfEmployee.remove(j);
				
		
	
		}
		
			
		
	}

	@Override
	public void getAllEmployees() {
		for(int i = 0; i<listOfEmployee.size();i++) {
			System.out.println("ID: "+listOfEmployee.get(i).getId()+" Name: "+listOfEmployee.get(i).getName()+" Phone Number: "+listOfEmployee.get(i).getPhoneNumber()+" Address: "+listOfEmployee.get(i).getAddress());
		}
	}

	@Override
	public void printAllEmployeeHierarchy() {
		
		ArrayList<Employee> temp = new ArrayList<>();
		temp.addAll(listOfEmployee);
		ArrayList<Employee> dir = new ArrayList<>();
		for(int i = 0; i < temp.size(); i++) {
			
			if(temp.get(i).isManager()) {
				
				String name = temp.get(i).getName();
				System.out.println(name);
				temp.remove(i);
				
				for(int j = 0; j<temp.size() ; j++) {
					if(temp.get(j).getManagerName()!=null && temp.get(j).getManagerName().equalsIgnoreCase(name))
						System.out.println("---"+temp.get(j).getName());
			}}
		}
		
	}

}
