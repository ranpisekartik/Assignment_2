package com.example.hello;

import org.springframework.data.repository.CrudRepository;

import com.example.hello.User_Entity;
import com.example.hello.models.FavTeams;


public interface FavTeamRepo extends CrudRepository<FavTeams, Long> {

	

}