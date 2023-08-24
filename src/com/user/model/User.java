package com.user.model;
 
public class User { 
 	 
 	private Integer id;  	
 	private String firstname;     
 	private String lastname;     
 	private String username;     
 	private String email;     
 	private Integer phone;     
 	private String address;     
 	private String password; 
 	public Integer getId() { 
 	 	return id; 
 	} 
 	public void setId(Integer id) { 
 	 	this.id = id; 
 	} 
 	public String getFirstname() {  	 	
 		return firstname; 
 	} 
 	public void setFirstname(String firstname) { 
 	 	this.firstname = firstname; 
 	} 
 	public String getLastname() {  	 	
 		return lastname; 
 	} 
 	public void setLastname(String lastname) { 
 	 	this.lastname = lastname; 
 	} 
 	public String getUsername() {  	 	
 		return username; 
 	} 
 	public void setUsername(String username) { 
 	 	this.username = username; 
 	} 
 	public String getPassword() {  	 	
 		
 		return password; 
 	} 
 	public void setPassword(String password) { 
 	 	this.password = password; 
 	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	public int getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		this.email = email;
		
	}
	public void setPhone(Integer phone2) {
		// TODO Auto-generated method stub
		this.phone = phone;
	}
	public void setAddress(String address2) {
		// TODO Auto-generated method stub
		this.address = address;
		
	} 
} 
