package com.verizontraining.springdidemoreference;

import java.util.List;

public class Club {

	private String clubName;
	private List<Player> players;

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Club [clubName=" + clubName + ", players=" + players + "]";
	}

}
