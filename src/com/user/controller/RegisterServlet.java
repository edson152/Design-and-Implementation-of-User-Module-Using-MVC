package com.user.controller; 
 
import java.io.IOException; 
 
import javax.servlet.RequestDispatcher; import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse; 
  import com.user.dao.UserDao; import com.user.model.User; 
 
@WebServlet("/RegisterServlet") 
public class RegisterServlet extends HttpServlet 
{  
    private static final long serialVersionUID = 1L; 
 
UserDao userDao; 
 
public void init() 
{ 
    userDao = new UserDao(null); 
}  
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 	 	 
 	 	 
String firstname = request.getParameter("firstname"); 
String lastname = request.getParameter("lastname"); 
String username = request.getParameter("username"); 
String email = request.getParameter("email"); 
Integer phone = Integer.parseInt(request.getParameter("phone")); 
String address = request.getParameter("address"); 
String password = request.getParameter("password"); 
 
User user = new User(); 
 user.setFirstname(firstname); 
 user.setLastname(lastname); 
 user.setUsername(username); 
 user.setEmail(email); 
 user.setPhone(phone); 
 user.setAddress(address); 
 user.setPassword(password); 
  try {     userDao.UserRegistation(user); 
 
    String register_done = userDao.UserRegistation(user); 
 
    if (register_done.equals("Successfully Registration")) 
    { 
        request.setAttribute("RegisterSuccess", register_done); 
        RequestDispatcher requestdisp = request.getRequestDispatcher("Login.jsp");         
        requestdisp.forward(request, response); 
    }     else     { 
        request.setAttribute("Sorry. Try Again!", register_done); 
        RequestDispatcher requestdisp = request.getRequestDispatcher("Register.jsp");         
        requestdisp.include(request, response);     } 
 
 } 
catch (Exception e) 
{ 
 
    e.printStackTrace(); 
} 
         
         
 	} 
} 
