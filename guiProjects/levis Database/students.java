import java.sql.ResultSet;
import java.sql.SQLException;

public class students {

	
	public void getStudents(ResultSet rs) throws SQLException {

		while (rs.next()) {
			
			System.out.println(" Student id " +rs.getInt(1) + "" +" name: " + rs.getString("name") +" " +" Address:" +rs.getInt(3) );
		}
	}
	public void insertStudent( String name, int gender, int address,int parentId) {
		 String insert = "insert into students (name, gender, address, pld) VALUES("+name+","+gender+", "+address+", "+parentId+" )";
	     
		}
	
	
}

