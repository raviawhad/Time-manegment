package com.example.demo.userService;



import com.example.demo.Entity.User;

public interface Userinterface {
     User registerUser(User user);
     User getUserById(Long id);
     User updateUser(Long id, User updatedUser);
     User assignRole(Long id, String role);
}
