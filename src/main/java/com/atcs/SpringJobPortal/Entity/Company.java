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

@Entity
@Table(name="Company")
public class Company {
	public Company(int id, String name, String about, List<com.atcs.SpringJobPortal.Entity.Job> job) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		Job = job;
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
	@OneToMany(mappedBy="company")
	List<Job> Job;
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
	@JsonManagedReference
	public List<Job> getJob() {
		return Job;
	}
	public void setJob(List<Job> job) {
		Job = job;
	}
	
}
