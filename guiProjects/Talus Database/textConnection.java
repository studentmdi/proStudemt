import java.sql.*;

public class textConnection {
	String url = "jdbc:mysql://localhost:3306/school";
	String user = "root";
	String password = "laminjatta";

  public textConnection ()throws Exception {
	
   }
  
   Connection con =DriverManager.getConnection(url,user,password);
   Statement st = con.createStatement();
   ResultSet  r = st.executeQuery("");

   //UPDATE `address` SET `id`=[value-1],`Address`=[value-2] WHERE 1
 public void update(String Aname, int Aid) throws SQLException{
	String update = "update address set Address = '"+ Aname+"' where id = "+Aid+"";
	
	int u = st.executeUpdate(update);
	System.out.println(u +"affected");
}


}
