package ObjectClass;

import java.util.Objects;

public class Employee {
	String firstName;
	String lastName;
	int age;
	String address;
	int salary;
	String department;
	@Override
	public int hashCode() {
		return Objects.hash(address, age, department, firstName, lastName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(department, other.department) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && salary == other.salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", salary=" + salary + ", department=" + department + "]";
	}
	public Employee(String firstName, String lastName, int age, String address, int salary, String department) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}
	
	
	
}
