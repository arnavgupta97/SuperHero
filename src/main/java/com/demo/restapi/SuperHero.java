package com.demo.restapi;

import java.util.ArrayList;

public class SuperHero {

	public int id;
	public String name;
	public ArrayList<String> superpower;
	public int rating;
	
	public SuperHero(int id, String name, ArrayList<String> superpower, int rating) {
		this.id = id;
		this.name = name;
		this.superpower = superpower;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getSuperpower() {
		return superpower;
	}
	public void setSuperpower(ArrayList<String> superpower) {
		this.superpower = superpower;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
