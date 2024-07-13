package com.example.demo.userException;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(Long id) {
		super(String.valueOf(id));
    }
	public UserNotFoundException() {
		super("user Id Must !!");
	}
}
