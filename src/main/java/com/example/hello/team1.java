package com.example.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class team1 {
	 // This tells Hibernate to make a table out of this class


	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private String abbr;
	    
	    private String favGame;
        
		public String getFavGame() {
			return favGame;
		}
		public void setFavGame(String favGame) {
			this.favGame = favGame;
		}
		public String getAbbr() {
			return abbr;
		}
		public void setAbbr(String abbr) {
			this.abbr = abbr;
		}
		



}