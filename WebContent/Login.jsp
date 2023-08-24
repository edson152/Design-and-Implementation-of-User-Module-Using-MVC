<% 
    if(session.getAttribute("login")!=null) 
    { 
        response.sendRedirect("Home.jsp");  
    } 
%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> <title>User Logging in </title> 
<link rel="stylesheet" href="css+img+polices/style.css"> 
<link rel="stylesheet" 
href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">  
</head> 
<body> 
<br /> 
<br /> 
 
 
</head> 
<body> 
 	 
 	<center> 
 	<div class="login-container"> 
 	 	<h1 class="titre"> Login </h1> 
 	 
 	 	<form method="POST" action="${pageContext.request.contextPath}/LoginServlet" class="login-form">               	
<i class="fas fa-user"> </i>  <input id="login-user" type="text" name="username" placeholder="  Enter Your Username" required><br/><br/>  	 	      
<i class="fas fa-lock"> </i> <input id="login-pass" type="password" name="password"  placeholder="  Enter Your Password" required><br/><br/> 
 	 	      <button type='submit'value="submit" name="submit">Login</button><br/> 
 	 	      <button type="reset" value="reset" name="reset">Reset</button>
 	 	</form> 
  <h2 class="text"> Don't have an account ? <a href="Register.jsp"> Register </a>!</h2> 
 	 	 
 	 	<h2 class="text" style="color:green"> 
 	 	<% 
            if(request.getAttribute("RegisterSuccess")!=null) 
                 { 
                        out.println(request.getAttribute("RegisterSuccess"));  
                  } 
        %> 
        </h2> 
         
        <h2 class="text" style="color:red"> 
        <% 
             if(request.getAttribute("Wrong Username or Password")!=null) 
                  { 
                        out.println(request.getAttribute("Wrong Username or Password"));  
                  } 
         %> 
         </h2> 
 	</div> 
</center> 
</body> 
</html> 
