package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.userService.Userinterface;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
 Userinterface userservice;

@PostMapping("/register")
ResponseEntity<User>registerUser(@RequestBody User user){
	User registerUser = userservice.registerUser(user);
	return ResponseEntity.ok(registerUser);
		
	}

@GetMapping("/getUserById")
  ResponseEntity<User>getUserById(@PathVariable Long id){
	  User userById = userservice.getUserById(id);
	return ResponseEntity.ok(userById);
	  
  }
@PutMapping("/updarteUser")
  ResponseEntity<User>updateUser(@PathVariable Long id,
		  @RequestBody User Updated){
	User updateUser = this.userservice.updateUser(id, Updated);
	return ResponseEntity.ok(updateUser);
	
}
  ResponseEntity<User> assignRole(Long Id, String role){
	return null;
	
}

}
