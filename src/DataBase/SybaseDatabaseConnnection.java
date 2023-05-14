package DataBase;

import java.util.ArrayList;

public class SybaseDatabaseConnnection implements DatabaseConnection {

	protected boolean isConnectionAlive;
	@Override
	public void connect(String conDetail) {
		System.out.println("Database driver jdbc:sqlanywhere:uid=DBA pwd=DBA eng=devdb database=devdb host=172.20.20.20");
		System.out.println("Connection Established ");
		isConnectionAlive = true;

	}

	@Override
	public void disconnect() {
		System.out.println("Connection Closed");
		isConnectionAlive=false;

	}

	@Override
	public ArrayList<String> fireQuery(String query) {
		System.out.println(query);
		ArrayList<String> l = new ArrayList<String>();
		l.add("Language  |     Documentation");
		l.add("Java      |     https://docs.oracle.com/en/java/");
		l.add("Python    |     https://docs.python.org/3/");
		
		return l;
	}

	@Override
	public void checkConnectionStatus() {
		if(isConnectionAlive==true) {
			System.out.println("Connection Alive");
		}
		else {
			
			System.out.println("Connection Dead");
		}

	}


}
