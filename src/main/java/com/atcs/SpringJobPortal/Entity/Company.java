package com.atcs.SpringJobPortal.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
//Company entity
@Entity
@Table(name="Company")
public class Company {
	
	
	
		public Company(int id, String name, String about, List<Job> job, List<Message> message) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		this.job = job;
		this.message = message;
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
	@OneToMany(mappedBy = "company")
	List<Job> job;
	@JsonManagedReference
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
	
	@OneToMany
	List<Message>message;
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	

}
