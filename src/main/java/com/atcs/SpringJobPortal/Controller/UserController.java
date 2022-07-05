package com.atcs.SpringJobPortal.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.SpringJobPortal.Entity.Job;
import com.atcs.SpringJobPortal.Entity.User;
import com.atcs.SpringJobPortal.Repo.JobRepo;
import com.atcs.SpringJobPortal.Repo.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepo ur;

	@Autowired
	JobRepo jr;

	@GetMapping("/")
	public List<User> get() {
		return ur.findAll();
	}

	@GetMapping("/viewjobs")
	public List<Job> getjobs(){
		List<Job> joblist=jr.findAll();
		List<Job> joblist_wu=new ArrayList<Job>();
		
		for(int i=0; i<joblist.size(); i++) {
			Job obj=joblist.get(i);
			joblist_wu.add(new Job(obj.getJob_id(), obj.getRole(), obj.getLocation(), obj.getExp(), obj.getSkills(), obj.getCtc(), obj.getDeadline(), obj.getType(), obj.getPostdate(), obj.getDegree(), obj.getCompany(), null));
		}
		
		return joblist_wu;
	}
	
	
	@GetMapping("/appliedjobs/{userid}")
	public Job appliedJobs(@PathVariable int userid){
		
		List<Job> jobs=jr.findAll();
		
		int temp=-1;
		
		for(int i=0; i<jobs.size(); i++) {
			List<User> user=jobs.get(i).getUser();
				for(User u : user) {
					if(u.getUser_id()==userid) {
						temp=i;
						break;
					}
				}
		}
		if(temp!=-1) {
			//for removing usersApplied from job object
			Job j=jobs.get(temp);
			Job newJob=new Job(j.getJob_id(), j.getRole(), j.getLocation(), j.getExp(), j.getSkills(), j.getCtc(), j.getDeadline(), j.getType(), j.getPostdate(), j.getDegree(), j.getCompany(), null);
			return newJob;}
		else {
			return null;}
		
	}	
	
	
	
	
	
	
	
	@PostMapping("/")
	public List<User> post(@RequestBody User e) {
		ur.save(e);
		return ur.findAll();
	}

	@PutMapping("/")
	public List<User> put(@RequestBody User ea) {
		ur.save(ea);
		return ur.findAll();
	}

	@DeleteMapping("/{id}")
	public List<User> delete(@PathVariable int id) {
		ur.deleteById(id);
		return ur.findAll();
	}
}
