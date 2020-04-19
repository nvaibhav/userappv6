package com.app.service;

import java.util.Arrays;
import java.util.List;

import com.app.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<User> getAllUsers() {
		System.out.println("getting all users.");
		return Arrays.asList(new User("11","Tom","Soywer","sTom"),
				new User("12","Pat","Scott","sPat"),
				new User("13","John","Paul","pJohn"));
	}
}
