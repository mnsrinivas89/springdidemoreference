package com.verizontraining.springdidemoreference;

public class Player {

	private String name;
	private String country;
	private String position;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", position=" + position + "]";
	}

}
