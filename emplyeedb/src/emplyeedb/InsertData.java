package emplyeedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "1407";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO emp (id, name, salary, email) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "501");
		    statement.setString(2, "chinmayee");
		    statement.setString(3, "32000");
		    statement.setString(4, "chinmayee@microsoft.com");
		    statement.setString(1, "502");
		    statement.setString(2, "Neha");
		    statement.setString(3, "38000");
		    statement.setString(4, "neha@microsoft.com");
		    statement.setString(1, "503");
		    statement.setString(2, "Vaishnavi ");
		    statement.setString(3, "48000");
		    statement.setString(4, "vaishnavi@microsoft.com");
		    statement.setString(1, "504");
		    statement.setString(2, "Sneha");
		    statement.setString(3, "30000");
		    statement.setString(4, "snehax@microsoft.com");
		    statement.setString(1, "505");
		    statement.setString(2, "Varshitha");
		    statement.setString(3, "45000");
		    statement.setString(4, "varshitha@microsoft.com");
		    statement.setString(1, "506");
		    statement.setString(2, "sriya");
		    statement.setString(3, "35000");
		    statement.setString(4, "sriya@microsoft.com");





		    
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
	/*
	 * Using a Statement for a static SQL query. Using a PreparedStatement for a
	 * parameterized SQL query and using setXXX() methods to set values for the
	 * parameters. Using execute() method to execute general query. Using
	 * executeUpdate() method to execute INSERT, UPDATE or DELETE query Using
	 * executeQuery() method to execute SELECT query. Using a ResultSet to iterate
	 * over rows returned from a SELECT query, using its next() method to advance to
	 * next row in the result set, and using getXXX() methods to retrieve values of
	 * columns.
	 */	

}
