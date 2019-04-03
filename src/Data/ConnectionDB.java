package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionDB {
	
	public static Connection getConnection() throws SQLException {
		Connection myConnection = null;
		try{
			String username = "system";
			String password = "123";
			String service = "localhost";
			String url = "jdbc:oracle:thin:";

			myConnection = DriverManager.getConnection(url+username+"/"+password+"@"+service);
		} 
		catch (SQLException ex){
			System.out.println(ex.getMessage());
			return null;			
		}
		return myConnection;
	}
}
