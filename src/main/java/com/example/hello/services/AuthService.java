package com.example.hello.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.UserRepository1;
import com.example.hello.User_Entity;

@Service
public class AuthService {

	@Autowired
	UserRepository1 userRepo;
	
	private static Map<String, User_Entity> activeSessions = new HashMap<String, User_Entity>();
	
	public boolean isUniqueID(Long userId) {
		ArrayList<User_Entity> user = (ArrayList<User_Entity>) userRepo.findAll();
		Boolean unique = true;
		for(User_Entity x : user) {
			if(x.getUserID().equals(userId)) {
				unique = false;
			}
		}
		
		return unique;
	}
	
	public Object getUserByID(Long userId) {

		Optional<User_Entity> user = null;
		user = userRepo.findById(userId);
		return user;
	}

	public boolean isSessionAlive(String sessionId) {

		return activeSessions.containsKey(sessionId);
	}

	public User_Entity getSession(String sessionId) {
		return activeSessions.get(sessionId);
	}

	public void removeSession(String id) {
		activeSessions.remove(id);
	}
}
