package DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseMain {
	public static void main(String args[]) {

	
	int choice=0;
	int d=0;
	while(true){
		System.out.println("Press 1 for Oracle database, Press 2 for Sybase Database");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		
		case 1:
			OracleDatabaesConnection o = new OracleDatabaesConnection();
			o.connect("Database driver oracle.jdbc.driver.OracleDriver");
			
			ArrayList<String> queryResult = o.fireQuery("Select * from student");
			for(String i:queryResult) {
				System.out.println(i);
			}
			o.checkConnectionStatus();
			o.disconnect();
			o.checkConnectionStatus();
			break;
		case 2:
			SybaseDatabaseConnnection s = new SybaseDatabaseConnnection();
			s.connect("Database driver oracle.jdbc.driver.OracleDriver");
			ArrayList<String> queryResultt = s.fireQuery("Select * from student");
			for(String i:queryResultt) {
				System.out.println(i);
			}
			s.checkConnectionStatus();
			s.disconnect();
			s.checkConnectionStatus();
			break;
		
	}
		System.out.println("Press 1 to continue/ Press any other number on keyboard to exit");
		d = sc.nextInt();
		if(d!=1) {
		
			break;
		}
		}
}
}