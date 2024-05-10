package emplyeedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "1407";
		 
		try {
			 Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "UPDATE emp SET name=?, salary=?, email=? WHERE id=?";
			    
			    PreparedStatement statement = conn.prepareStatement(sql);
			    statement.setString(1, "Sindhu");
			    statement.setString(2, "37000");
			    statement.setString(3, "sindhu@microsoft.com");
			    statement.setString(4, "506");
		 
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
