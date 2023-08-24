<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%> <%@page import="com.user.dao.*" %> 
<%@page import="com.user.model.*" %> 
<%@page import="com.user.connection.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>User Page</title> 
<link rel="stylesheet" href="css+img+polices/style.css"> 
<script type="text/javascript"> 
</script> 
</head> 
<body> 
<br /> 
<br /> 
<br /> 
 
<center> 
 	 	<div class="home-container"> 
 	 	<br /><br /><br /> 
 	 	<h1 class="text-home">  
    <% 
    if(session.getAttribute("login")== null || session.getAttribute("login") == "")  
    { 
        response.sendRedirect("Login.jsp"); 
    } 
    %> 
      	 	Welcome, <%=session.getAttribute("login")%> <br /> 
      	 	 
      	 	<a href="<%=request.getContextPath()%>/LogoutServlet"> Logout </a> 
 	 	</h1> 
 	 	 
 	 	 
 	 	 
 	 	</div> 
 	</center> 
 	 
</body> 
</html> 
