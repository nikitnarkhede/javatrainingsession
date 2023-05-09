package class_assignment;

import java.util.Scanner;

public class PersonMain {
	public static void main(String args[]) {
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the age");
		Person pobj = new Person(age,name);
		pobj.PersonSummary();
		
	}
}
