package com.user.dao; 
 
 import java.sql.Connection; 
 import java.sql.PreparedStatement; 
 import java.sql.ResultSet; 
 import java.sql.SQLException; 
 import com.user.connection.JDBC; 
 import com.user.model.User; 
 
public class UserLoginDao 
{  
 	private Connection connection; 
 
 	public UserLoginDao(Connection connection) 
 	{ 
 	 	super(); 
 	 	this.connection = connection; 
 	} 
 
 	public String UserLogin(User user) throws ClassNotFoundException 
 	{ 
 
 	 	String user_name=""; 
 	 	String pass_word=""; 
 
 	 	String username = user.getUsername(); 
 	 	 	String password = user.getPassword(); 
 
 	String query; 
 	PreparedStatement preparedStatement; 
 	 	              	         	try { 
 	         	 	connection = JDBC.getConnection(); 
 	         	 	query = "select * from user where username = ? and password = ? ";  	         	 	
 	         	 	preparedStatement = this.connection.prepareStatement(query); 
 	         	 	 
 	         	preparedStatement.setString(1, user.getUsername());  
 	         	preparedStatement.setString(2, user.getPassword());  
 	      	 	System.out.println(preparedStatement); 
             	ResultSet rs = preparedStatement.executeQuery(); 
 	 	 	 
 	 	 	while(rs.next()) 
            {     
                user_name=rs.getString("username");                   pass_word=rs.getString("password");  
                 
                if(username.equals(user_name) && password.equals(pass_word))   
                { 
                    return "Login Successfully";  
                } 
            }  
 
 	 	} catch (SQLException e) 
{ 
  	printSQLException(e); 
}  return "Wrong Username or Password"; 
 	 
 	} 
  	private void printSQLException(SQLException ex) 
{ 
 	for (Throwable e : ex) {  	if (e instanceof SQLException) { 
 	 	e.printStackTrace(System.err); 
 	 	System.err.println("SQLState: " + ((SQLException)e).getSQLState()); 
 	 	System.err.println("Error Code: " + ((SQLException)e).getErrorCode()); 
 	 	System.err.println("Message: " + e.getMessage()); 
 	 	Throwable t = ex.getCause(); 
 	 	while (t != null) 
 	 	{ 
 	 	 	System.out.println("Cause: " + t); 
 	 	 	t = t.getCause(); 
 	 	} 
 
} 	} 	
 
} 	} 	
