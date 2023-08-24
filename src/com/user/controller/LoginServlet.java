package com.user.controller; 
 
import java.io.IOException; 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 
import com.user.dao.UserLoginDao; 
import com.user.model.User; 
 
@WebServlet("/LoginServlet") 
public class LoginServlet extends HttpServlet 
{ 
 	private static final long serialVersionUID = 1L; 
  
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 	 	 
 	 	 
 	 	String username = request.getParameter("username"); 
String password = request.getParameter("password"); 
 
User user = new User(); 
 user.setUsername(username); user.setPassword(password); 
 
UserLoginDao userDao = new UserLoginDao(null); 
 try 
{ 
 	String user_done = userDao.UserLogin(user); 
 
 	if (user_done.equals("Login Successfully")) 
 	{ 
 	 	HttpSession session = request.getSession();  	 	session.setAttribute("login", user.getUsername()); 
 	 	RequestDispatcher requestdisp = request.getRequestDispatcher("Home.jsp");  	 	requestdisp.forward(request, response); 
 	} 
 	else 
 	{ 
 	 	request.setAttribute("Wrong Username or Password", user_done); 
 	 	RequestDispatcher requestdisp = request.getRequestDispatcher("Login.jsp");  	 	requestdisp.include(request, response); 
 	} 
 } catch (ClassNotFoundException e) 
{ 
 	// TODO Auto-generated catch block  	e.printStackTrace(); 
} 
 	 	 
 	 	 
 	} 
} 
