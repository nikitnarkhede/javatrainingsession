package arraylistperson;

import java.util.ArrayList;

public class PersonImpl {
	public static void main(String args[]) {
		
		ArrayList<Person> personObjList = new ArrayList<>();

		Person p1 = new Person("Nikit",23);
		Person p2 = new Person("Sourabh",55);
		Person p3 = new Person("Leap",88);
		Person p4 = new Person("Pop",27);
		Person p5 = new Person("Singh",66);
		Person p6 = new Person("Nikit",23);
		Person p7 = new Person("Nikit",23);
		Person p8 = new Person("Nikit",23);
		Person p9 = new Person("school",77);
		Person p10 = new Person("Nikit",23);
		
		personObjList.add(p1);
		personObjList.add(p2);
		personObjList.add(p3);
		personObjList.add(p4);
		personObjList.add(p5);
		personObjList.add(p6);
		personObjList.add(p7);
		personObjList.add(p8);
		personObjList.add(p9);
		personObjList.add(p10);
		
		ArrayList<Person> personObj1 = new ArrayList<>();
		
		for(int i =0 ; i<personObjList.size();i++) { 
			if(personObjList.get(i).getName().startsWith("S") || personObjList.get(i).getName().startsWith("s")) {
			System.out.println(personObjList.get(i).getName());
			personObj1.add(personObjList.get(i));
			}
		}
		
		
		System.out.println("-----------------------------------------------------------");
		
		for(int i =0 ; i<personObjList.size();i++) 
			System.out.println(personObjList.get(i));
		
		System.out.println("-----------------------------------------------------------");
		
		for(Person p:personObj1) {
			
			System.out.println(p);
		}
			
		
		
	}
}
