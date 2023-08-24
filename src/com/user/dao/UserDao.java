package com.user.dao; 

 import java.sql.Connection; 
 import java.sql.PreparedStatement; 
 import java.sql.SQLException; 
 import com.user.connection.JDBC; 
 import com.user.model.User; 
 
public class UserDao 
{  
    private Connection connection; 
 
    public UserDao(Connection connection) 
    {         super(); 
        this.connection = connection; 
    }  
    public String UserRegistation(User user) throws ClassNotFoundException     { 
        String query; 
        PreparedStatement preparedStatement; 
 	             
         	try { 
            connection = JDBC.getConnection(); 
            query = "insert into user (id, firstname, lastname, username, email, phone, address, password) VALUES (0, ?, ?, ?, ?,?,?, ?)"; 
            preparedStatement = this.connection.prepareStatement(query); 
             preparedStatement.setString(1, user.getFirstname());             
             preparedStatement.setString(2, user.getLastname());  
             preparedStatement.setString(3, user.getUsername());             
             preparedStatement.setString(4, user.getEmail());      
             preparedStatement.setInt(5, user.getPhone());             
             preparedStatement.setString(6, user.getAddress());
             preparedStatement.setString(7, user.getPassword()); 
             preparedStatement.executeUpdate(); 
 
            return "Successfully Registration";  
        } catch (SQLException e)
         	{             printSQLException(e); 
               } return "Sorry. Try Again!"; 
 
    }      private void printSQLException(SQLException ex) 
{ 
    for (Throwable e: ex) { 
    	if (e instanceof SQLException) { 
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
    } 
} 
    } 
     
} 
