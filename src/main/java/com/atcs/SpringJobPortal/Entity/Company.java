package com.atcs.SpringJobPortal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	
	
	
	public Company(int id, String name, String about) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
	}
	Company(){
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int id;
	@Column
String name;
	@Column
String about;
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	

}
