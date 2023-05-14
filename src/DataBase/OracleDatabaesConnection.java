package DataBase;

import java.util.ArrayList;
import java.util.List;

public class OracleDatabaesConnection implements DatabaseConnection {
	protected boolean isConnectionAlive;
	@Override
	public void connect(String conDetail) {
		System.out.println(conDetail);
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
		ArrayList<String> l = new ArrayList<String>();
		System.out.println(query);
		l.add("Name  |     Email     | Mobile no.");
		l.add("Nikit | nik@gmail.com | 1234567890 ");
		
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
