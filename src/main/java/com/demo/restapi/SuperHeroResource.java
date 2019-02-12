package com.demo.restapi;

import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("superhero")
public class SuperHeroResource {

	@POST
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	public SuperHero addhero(@FormParam("name") String name, @FormParam("superpower") String superpower, @FormParam("rating") int rating) {
		SuperHeroDao hero = new SuperHeroDao();
		ArrayList<String> superpowers =  new ArrayList<String>(Arrays.asList(superpower.split(",")));
		return hero.addHero(name,superpowers,rating);
	}
	@POST
	@Path("delete")
	public void deletehero(@FormParam("id") int id) {
		SuperHeroDao hero = new SuperHeroDao();
		hero.deleteHero(id);
	}
	@POST
	@Path("get")
	@Produces(MediaType.APPLICATION_JSON)
	public SuperHero gethero(@FormParam("id") int id) {
		SuperHeroDao hero = new SuperHeroDao();
		return hero.getHero(id);
	}
	
	@POST
	@Path("common")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<String> getcommonpower(@FormParam("power") String power) {
		SuperHeroDao hero = new SuperHeroDao();
		return hero.getCommonPower(power);
	}
}
