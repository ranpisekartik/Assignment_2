package com.example.hello;

import org.springframework.data.repository.CrudRepository;


import com.example.hello.User_Entity;

public interface UserRepository1 extends CrudRepository<User_Entity, Long> {

	

}