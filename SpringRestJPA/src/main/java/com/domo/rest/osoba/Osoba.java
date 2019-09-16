package com.domo.rest.osoba;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Osoba {
	
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private int visina;
	private int tezina;
	private String edukacija;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int i) {
		this.visina = i;
	}
	public int getTezina() {
		return tezina;
	}
	public void setTezina(int tezina) {
		this.tezina = tezina;
	}
	public String getEdukacija() {
		return edukacija;
	}
	public void setEdukacija(String edukacija) {
		this.edukacija = edukacija;
	}
		
	
}
