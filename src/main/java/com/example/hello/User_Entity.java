package com.example.hello;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.hello.models.FavTeams;

@Entity
@Table(name = "User_Entity")
public class User_Entity {

	@Id
	private Long userID;
	
	@Column
    private String name;
	
	//private String email;
	@Column
	private Boolean Activity;
	
	//private FavTeams favTeam1;
	
	@OneToMany(mappedBy="selectedBy")
	private List<FavTeams> favTeams;

	


	public List<FavTeams> getFavTeams() {
		return favTeams;
	}


	public void setFavTeams(List<FavTeams> favTeams) {
		this.favTeams = favTeams;
	}


	public boolean isBlocked() {
		return Activity;
	}


    /*public FavTeams getFavTeam1() {
		return favTeam1;
	}


	public void setFavTeam1(FavTeams favTeam1) {
		this.favTeam1 = favTeam1;
	}*/


	public Boolean getActivity() {
		return Activity;
	}

	public void setActivity(Boolean activity) {
		Activity = activity;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}*/

	
	
}
