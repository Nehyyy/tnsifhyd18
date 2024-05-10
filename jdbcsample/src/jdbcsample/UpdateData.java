package jdbcsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/database1";
		String username = "root";
		String password = "1407";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "1");
		    statement.setString(2, "WHB Gates");
		    statement.setString(3, "bill.gates@microsoft.com");
		    statement.setString(4, "suresh");
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
