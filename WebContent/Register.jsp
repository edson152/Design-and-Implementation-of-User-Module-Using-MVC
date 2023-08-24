<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>User Registration System</title> 
<link rel="stylesheet" href="css+img+polices/style.css"> 
<link rel="stylesheet" 
href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">  
<script>  
function validate() 
{  
     var fullname = document.form.fullname.value;      var email = document.form.email.value;      var username = document.form.username.value;       var password = document.form.password.value;      var conpassword= document.form.conpassword.value; 
      
     if (firstname== null || firstname == "" && lastname == null || lastname == "") 
     {  
     alert("Please enter your First Name or Last Name.");       return false;  
     } 
     else if (username == null || username == "") 
     { 
      alert("Please enter your Username.");       return false; 
     } 
     else if (email == null || email == "") 
     {  
     alert("Please enter your Email.");       return false;  
     } 
     else if (phone == null || phone == "") 
     {  
     alert("Please enter your Number Phone.");       return false;  
     } 
     else if (address == null || address == "") 
     {  
     alert("Please enter your Address.");       return false;  
     } 
     else if(password.length<8) 
     {  
     alert("Password must be at least 8 characters long.");       return false;  
     }  
 }  
</script>  
 
</head> 
<body> 
 
<br /> 
<br /> 
<center> 
 	<div class="regis-container"> 
 	 	<h1 class="titre"> Register </h1> 
 	 	 
 	 	<br /> 
 	 	<form action="<%=request.getContextPath()%>/RegisterServlet" method="post" class="regis-form"> 
 	 	 	<table> 
 	 	 	 	<i class="fas fa-user"> </i>  <input type='text' 
name="firstname"  class="regis-input" placeholder='  Enter Your First Name' required> <br/><br/> 
 	 	      <i class="fas fa-user"> </i>  <input type='text' name="lastname" class="regis-input" placeholder='  Enter Your Last Name' required><br/><br/>               	<i class="fas fa-user"> </i>  <input type='text' name="username" class="regis-input" placeholder='  Enter Your Username' required><br/><br/>  	 	      <i class="fas fa-envelope"> </i>  <input type='email' name="email" class="regis-input" placeholder='  Enter Your Email' required><br/><br/>  	 	      <i class="fas fa-phone"> </i>  <input type='number' name="phone" class="regis-input" placeholder='  Enter Your Phone Number' required><br/><br/>  	 	      <i class="fas fa-user"> </i>  <input type='text' name="address" class="regis-input" placeholder='  Enter Your Address' required><br/><br/>  	 	      <i class="fas fa-lock"> </i>  <input type='password' name="password" class="regis-input" placeholder='  Enter Your Password' required><br/><br/> 
 
        <button type='submit' value="submit" name="submit"> Register </button> <br/> 
 	 	 	</table> 
 	 	</form> 
  <h2 class="text"> Already have an account ? <a href="Login.jsp"> Login </a>!</h2> 
 	 	 
 	 	<h2 class="text" style="color:red"> 
                <% 
                    if(request.getAttribute("Sorry. Try Again!")!=null) 
                    { 
                        out.println(request.getAttribute("Sorry. Try Again!"));  
                    } 
                %> 
        </h2> 
             
 	</div> 
</center> 
 
</body> 
</html> 
</head> 
