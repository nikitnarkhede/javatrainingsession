package class_assignment;

public class Person {
	private int age=0;
	private String name;
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
		
	}

	public void PersonSummary() {
		if(age==0) {
			System.out.println("Person name is " + name);
		}
		else {
			System.out.println("Person name is "+ name+" and age is"+age);
		}
	}


}
