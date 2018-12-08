package com.example.hello.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.FavTeamRepo;
import com.example.hello.User_Entity;
import com.example.hello.models.FavTeams;



@Service
public class FavTeam {

	@Autowired
	private FavTeamRepo favRepo;
	
	public ArrayList<FavTeams> getTeams(){
		Iterable<FavTeams> x = favRepo.findAll();
		ArrayList<FavTeams> list = new ArrayList<>();
		for(FavTeams i : x) {
			list.add(i);
		}
		System.out.println(list);
		return list;
	}
	
	public ArrayList<FavTeams> getFavTeams(User_Entity user) {
		ArrayList<FavTeams> Teams = getTeams();
		ArrayList<FavTeams> myTeams = new ArrayList<>();
		for (FavTeams a : Teams) {
			if (user.getUserID().equals(a.getSelectedBy().getUserID())) {
				myTeams.add(a);
			}
		}
		return myTeams;
	}
	
}
