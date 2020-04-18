package com.app.service;

import org.springframework.web.bind.annotation.RestController;

import com.app.user.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public List<User> getAllUsers() 
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/env", method = RequestMethod.GET, produces = "text/plain; charset=utf-8")
	public String getEnv()
	{
		System.out.println("inside getEnv");
		String env = "";
		try (InputStream input = new FileInputStream("/conf/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            for(String key : prop.stringPropertyNames()) {
            	  String value = prop.getProperty(key);
            	  env = env + key + ":" + value +".";
            	  System.out.println("env="+env);
            	}
        } catch (IOException ex) {
            ex.printStackTrace();
            env = ex.toString();
        }
		return env;
	}
}
