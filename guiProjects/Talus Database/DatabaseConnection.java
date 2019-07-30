
import java.sql.*;
public class DatabaseConnection {
	
public static void main(String[] args) throws Exception{
	

	String url = "jdbc:mysql://localhost:3306/school";
	String user = "root";
	String password = "laminjatta";
	
	
	String select = "SELECT * FROM students";
	String update =" update address set Address(place) = 'Tujerang Village' where id = 4";
	String Insert = "INSERT INTO address(Address(place)) VALUES('6')";
	String delete  = "DELETE FROM address where id = 1";

    Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection(url,user,password);
	Statement st = con.createStatement();
//	ResultSet  r = st.executeQuery(select);
		
	
	//update data
	  int rs = st.executeUpdate(update);
	  System.out.println(rs+" row affectrd");
	
	//insert data
//   boolean r = st.execute(Insert);
//	 System.out.println( r+" row inserted");
//	
   //looping through the record in a table
	//select data
//	
//	 ResultSet rs = st.executeQuery(select);
//	  while(rs.next()) {
//		
//		System.out.println("Student ID: "+rs.getInt(1)+" "+" Name: "+rs.getString("name") + " " +" Address: "+rs.getInt(3));
//
//	}
}

}
