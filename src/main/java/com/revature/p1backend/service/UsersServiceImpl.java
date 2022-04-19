package com.revature.p1backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p1backend.model.Users;
import com.revature.p1backend.repo.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersRepository userRepository;

	@Override
	public Users login(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsernameAndPassword(username, password);
	}

	@Override
	public Users logout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUser(String username) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsername(username);
	}

	@Override
	public Users updateUser(int id, Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
