package com.revature.p1backend.service;

import java.util.List;

import com.revature.p1backend.model.Users;

public interface UsersService {
	
	// Login/Logout services
	public Users login(String username, String password);
	public Users logout();
	
	// View/Update services
	public Users getUser (String username);
	public Users updateUser(int id, Users users);
	
	// Getting all users
	public List<Users> getAllUsers();

}
