package com.user.connection; 
 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
 
public class JDBC 
{  
 	private static final String driver="com.mysql.cj.jdbc.Driver"; 
 	private static final String URL="jdbc:mysql://localhost:3306/userregisterlogin"; 
 	private static final String USER="root"; 
 	private static final String PASSWORD="root"; 
 	 
 	static{ 
 	 	try { 
 	 	 	Class.forName(driver); 
 
 	 	} 
 	 	catch (ClassNotFoundException e) { 
 	 		e.printStackTrace(); 
 
        } finally{
        	
        }	
 	} 
 
{ 	
	
  }
  public static Connection getConnection() {
	// TODO Auto-generated method stub
	try {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return null;
 } 


public static void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) { 
 
 	try 
 	{ 
 	 	if (rs != null) 
 	 	 	rs.close();  	 	
 	 	if (ps != null) 
 	 	 	ps.close();  	 	
 	 	if (conn != null)  	 	 	
 	 		ps.close(); 
 	} 
 	catch (SQLException e) 
 	{ 
 
 	 	e.printStackTrace(); 
 	} 

} 
}
