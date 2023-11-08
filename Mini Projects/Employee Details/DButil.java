package MiniProject;
import java.sql.*;
public class DButil {
	private static final String URL = "jdbc:mysql://localhost:3306/svhec";
    private static final String USER = "root";
    private static final String PASSWORD = "loki123";

    public static Connection getConnectionObj() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } 
        catch (ClassNotFoundException e) {
        	System.out.println("Error "+ e.getMessage());
        }
        catch (SQLException e) {
        	System.out.println("Error "+ e);
        	 
        }
		return null;
    }

	
    
}
