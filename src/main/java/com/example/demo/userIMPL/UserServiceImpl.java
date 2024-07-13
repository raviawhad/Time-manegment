package com.example.demo.userIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.Entity.User;
import com.example.demo.userException.UserNotFoundException;
import com.example.demo.userRepo.UserRepository;
import com.example.demo.userService.Userinterface;

@Service
public class UserServiceImpl implements Userinterface {
	@Autowired
	private UserRepository userRepo;

	@Override
	public User registerUser(User user) {
		User saveduser = this.userRepo.save(user);
		return saveduser;
	}

	@Override
	public User getUserById(Long id) {
		this.userRepo.findById(id).
		orElseThrow(() -> new UserNotFoundException(id));
		return null;
	}

	@Override
	
	public User updateUser(Long id, User updatedUser) {
		User user = getUserById(id);
		user.setEmail(updatedUser.getEmail());
		user.setUsername(updatedUser.getUsername());
		user.setPassword(updatedUser.getPassword());
		return this.userRepo.save(user);
	}

	@Override
	public User assignRole(Long id, String role) {
		User user = getUserById(id);
        user.getRoles().add(role);
        return userRepo.save(user);
		
	}

}
