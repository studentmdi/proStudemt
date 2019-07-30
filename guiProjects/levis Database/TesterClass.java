import java.sql.*;
public class TesterClass {

	public static void main(String[] args) {
		
		try (
			Connection con = ConnectionClass.getConnection();
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM students");
		  
			)
		
		   {
//			students s = new students();
//			s.getStudents(rs);
			
			
			System.out.println("the first student details");
			rs.first();
			System.out.println(" Student id " +rs.getInt(1) + "" +" name: " + rs.getString("name") +" " +" Address:" +rs.getInt(3) );
			
			System.out.println("the last student details");
			rs.last();
			System.out.println(" Student id " +rs.getInt(1) + "" +" name: " + rs.getString("name") +" " +" Address:" +rs.getInt(3) );
		    
			rs.absolute(3);
		    System.out.println(" Student id " +rs.getInt(1) + "" +" name: " + rs.getString("name") +" " +" Address:" +rs.getInt(3) );
		   
		   }
		
		catch(SQLException w)  {
	System.err.println();
		}
	}
}
