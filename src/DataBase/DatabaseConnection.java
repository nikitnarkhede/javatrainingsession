package DataBase;

import java.util.ArrayList;

public interface DatabaseConnection {
	void connect(String conDetail);
	void disconnect();
	ArrayList fireQuery(String query);
	void checkConnectionStatus();
}
