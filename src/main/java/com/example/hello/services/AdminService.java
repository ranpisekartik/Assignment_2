package com.example.hello.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.UserRepository1;
import com.example.hello.User_Entity;

@Service
public class AdminService {

	@Autowired
	UserRepository1 userRepository;
	

	public boolean blockUser(String id) {
		Optional<User_Entity> x = userRepository.findById(Long.parseLong(id));

		

		if(x.isPresent()) {
			User_Entity account = (User_Entity) x.get();
			account.setActivity(true);
			userRepository.save(account);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean unblockUser(String id) {
	Optional<User_Entity> x = userRepository.findById(Long.parseLong(id));
		
		if(x.isPresent()) {
			User_Entity account = (User_Entity) x.get();
			account.setActivity(false);
			userRepository.save(account);
			return true;
		}else {
			return false;
		}
	}
}
