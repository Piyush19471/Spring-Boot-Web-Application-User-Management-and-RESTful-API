package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.User;

public interface UserService 
{

	public boolean registeredUser(User user);
	public User loginUser(String email,String password);
	public User creatUser(User user);
	public List<User> getUser();
	public Optional<User> getUserDetails(int id);
    public User updateuserdetails(int id , User user);
    public void deleteuser(int id);
    
    
    
	
}
