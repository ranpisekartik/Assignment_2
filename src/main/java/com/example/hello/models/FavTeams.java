package com.example.hello.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.hello.User_Entity;


@Entity
public class FavTeams {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer teamId;
	
	@Column
	private ArrayList favTeam ;
	
	@OneToOne
	private User_Entity selectedBy;
	
	public User_Entity getSelectedBy() {
		return selectedBy;
	}

	public void setSelectedBy(User_Entity selectedBy) {
		this.selectedBy = selectedBy;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public ArrayList getFavTeam() {
		return favTeam;
	}

	public void setFavTeam(ArrayList favTeam) {
		this.favTeam = favTeam;
	}

	

	

	
}
