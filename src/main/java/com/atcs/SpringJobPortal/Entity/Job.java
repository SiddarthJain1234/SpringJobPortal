package com.atcs.SpringJobPortal.Entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "job")
public class Job {



	

	
	public Job(int job_id, String role, String location, int exp, String skills, int ctc, Date deadline, String type,
			Date postdate, String degree, Company company) {
		super();
		this.job_id = job_id;
		this.role = role;
		this.location = location;
		this.exp = exp;
		this.skills = skills;
		this.ctc = ctc;
		this.deadline = deadline;
		this.type = type;
		this.postdate = postdate;
		Degree = degree;
		this.company = company;
	}
	Job() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int job_id;
	@Column
	String role;
	@Column
	String location;
	@Column
	int exp;
	@Column
	String skills;
	@Column
	int ctc;
	@Column
	Date deadline;
	@Column
	String type;
	@Column
	Date postdate;
	@Column
	String Degree;
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	@ManyToOne
	Company company;
	@JsonBackReference
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	

	
}
