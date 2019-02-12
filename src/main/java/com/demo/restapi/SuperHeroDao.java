package com.demo.restapi;

import java.util.ArrayList;
import java.util.HashSet;

public class SuperHeroDao {
    static int count=0;
	static ArrayList<SuperHero> superhero = new ArrayList<>();
	static HashSet<String> Name = new HashSet<>();
	
	public SuperHero addHero(String name, ArrayList<String> superpower, int rating) {
		count++;
		if(Name.contains(name)) {
			System.out.println("Super Hero Exists");
			return null;
		}else {
			SuperHero hero = new SuperHero(count,name,superpower,rating);
			Name.add(name);
			superhero.add(hero);
			return hero;
		}
	}
	public void deleteHero(int id) {
		for(SuperHero hero: superhero) {
			  if(hero.getId()==id) {
				  superhero.remove(hero);
				  System.out.println("Deleted Successfully");
				  return;
			  }
			}
		System.out.println("Not Deleted");
	}
	
public SuperHero getHero(int id) {
		
		for(SuperHero e: superhero) {
		  if(e.getId()==id) {
			  return e;
		  }
		}
		return null;
	}

public ArrayList<String> getCommonPower(String power) {
	ArrayList<String> ar = new ArrayList<String>();
	for(SuperHero e: superhero) {
		ArrayList<String> a = e.getSuperpower();
		if(a.contains(power)) {
			ar.add(e.getName());
		}
	}
	return ar;
}
}