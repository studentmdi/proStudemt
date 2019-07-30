import java.sql.SQLException;
import java.sql.*;
public class ConnectionClass {

	private static final String url = "jdbc:mysql://localhost:3306/school";
	private static final String user = "root";
	private static final  String password = "laminjatta";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

}
