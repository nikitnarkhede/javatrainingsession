package ObjectClass;

public class TestClass {
	public static void main(String args[]) {
		Employee e1 = new Employee("N","Na",2,"ABD",12000,"CSE");
		Employee e2 = new Employee("K","Ka",5,"SLP",12000,"Mech");
		Employee e3 = new Employee("N","Na",2,"ABD",12000,"CSE");
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		
	}
}
