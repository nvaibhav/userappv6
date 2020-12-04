package com.app.service;

import java.util.Arrays;
import java.util.List;

import com.app.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<User> getAllUsers() {
		System.out.println("getting all users.");
		return Arrays.asList(new User("111","Tom","Soywer","sTom"),
				new User("121","Pat","Scott","sPat"),
				new User("131","John","Paul","pJohn"));
	}
}
