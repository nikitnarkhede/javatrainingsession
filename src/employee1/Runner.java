/*
 
 O/P->
 Type true to add Manager else press false
true
Enter Id,Name,Email,Phone Number
1
nikit
n
1111
Enter Address Building Name, Street Name, City, State, Pincode 
q
q
q
q
111
To Continue press 1 else press any Number key 
1
Type true to add Manager else press false
true
Enter Id,Name,Email,Phone Number
2
leena
l
2222
Enter Address Building Name, Street Name, City, State, Pincode 
w
w
w
w
222
To Continue press 1 else press any Number key 
1
Type true to add Manager else press false
false
Enter Id,Name,Email,Phone Number, Manager Name
3
kite
k
333333
nikit
Enter Address Building Name, Street Name, City, State, Pincode 
e
e
e
e
333
To Continue press 1 else press any Number key 
1
Type true to add Manager else press false
false
Enter Id,Name,Email,Phone Number, Manager Name
4
train
t
4444
leena
Enter Address Building Name, Street Name, City, State, Pincode 
e
e
e
e
444
To Continue press 1 else press any Number key 
1
Type true to add Manager else press false
false
Enter Id,Name,Email,Phone Number, Manager Name
5
top
t
5555
nikit
Enter Address Building Name, Street Name, City, State, Pincode 
t
t
t
t
555
To Continue press 1 else press any Number key 
2
-----------------------------------
nikit
---kite
---top
leena
---train
-----------------------------------
-----------------------------------
ID: 1 Name: nikit Phone Number: 1111 Address: Address [buildingName=q, streetName=q, city=q, state=q, pincode=111]
ID: 2 Name: leena Phone Number: 2222 Address: Address [buildingName=w, streetName=w, city=w, state=w, pincode=222]
ID: 3 Name: kite Phone Number: 333333 Address: Address [buildingName=e, streetName=e, city=e, state=e, pincode=333]
ID: 4 Name: train Phone Number: 4444 Address: Address [buildingName=e, streetName=e, city=e, state=e, pincode=444]
ID: 5 Name: top Phone Number: 5555 Address: Address [buildingName=t, streetName=t, city=t, state=t, pincode=555]
-----------------------------------
-----------------------------------
Enter Id to delete Employee
4
nikit
---kite
---top
leena


*/
package employee1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Runner {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		EmployeeDirctoryImpl n = new EmployeeDirctoryImpl();
		boolean check=true;
		while(check) {
			
			boolean isManager=false;
			System.out.println("Type true to add Manager else press false");
			isManager =  sc.nextBoolean();
			if(isManager) {
			System.out.println("Enter Id,Name,Email,Phone Number");
			
			Employee e = new Employee();
			e.setId(sc.nextInt());
			sc.nextLine();
			e.setName(sc.next());
			e.setEmail(sc.next());	
			e.setPhoneNumber(sc.nextInt());
			e.setManager(true);
			e.setManagerName(null);
			sc.nextLine();
			
			System.out.println("Enter Address Building Name, Street Name, City, State, Pincode ");
			
			
			String buildingName=sc.next();
			String streetName=sc.next();
			String city=sc.next();
			String state=sc.next();
			int pincode=sc.nextInt();
			
			
			Address a = new Address(buildingName,streetName,city,state,pincode);
			
			e.setAddress(a);
			
			n.registerEmployee(e);
			}
			else {
				System.out.println("Enter Id,Name,Email,Phone Number, Manager Name");
				
				Employee e = new Employee();
				e.setId(sc.nextInt());
				sc.nextLine();
				e.setName(sc.next());
				e.setEmail(sc.next());	
				e.setPhoneNumber(sc.nextInt());
				sc.nextLine();
				e.setManager(false);
				e.setManagerName(sc.next());
				
				sc.nextLine();
				
				System.out.println("Enter Address Building Name, Street Name, City, State, Pincode ");
				
				
				String buildingName=sc.next();
				String streetName=sc.next();
				String city=sc.next();
				String state=sc.next();
				int pincode=sc.nextInt();
				
				
				Address a = new Address(buildingName,streetName,city,state,pincode);
				
				e.setAddress(a);
				
				n.registerEmployee(e);
			}
			System.out.println("To Continue press 1 else press any Number key ");
			sc.nextLine();
			int decision = sc.nextInt();
			sc.nextLine();
			
			if(decision!=1) {
				break;
			}
		}
		System.out.println("-----------------------------------");
		
		 n.printAllEmployeeHierarchy();
		
		 System.out.println("-----------------------------------");
		 System.out.println("-----------------------------------");
		 
		n.getAllEmployees();
		
		System.out.println("-----------------------------------");
		 System.out.println("-----------------------------------");
		
		 System.out.println("Enter Id to get Employee details");
		 int idd = sc.nextInt();
		 sc.nextLine();
		 n.getEmployee(idd);
		 
		 System.out.println("Enter Id to delete Employee");
		
		int dlte = sc.nextInt();
		 sc.nextLine();
		n.removeEmployee(dlte);
		
		 n.printAllEmployeeHierarchy();
	
	}}
