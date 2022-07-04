package com.atcs.SpringJobPortal.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.SpringJobPortal.Entity.Job;
import com.atcs.SpringJobPortal.Repo.JobRepo;

@RestController
@RequestMapping("/job")
public class JobController {
@Autowired
JobRepo jr;


@GetMapping("/")
public List<Job> get(){
	return jr.findAll();
}
@GetMapping("/exp/{exp}")
public List<Job> getbyexp(@PathVariable int exp){
	List<Job> list=jr.findAll();
	
	List<Job> listFinal=new ArrayList<Job>();
	
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getExp()<=exp) {
			listFinal.add(list.get(i));
		}
	}
	return listFinal;
}


@GetMapping("/loc/{loc}")
public List<Job> getbyloc(@PathVariable String loc){
	List<Job> list=jr.findAll();
	
	List<Job> listFinal=new ArrayList<Job>();
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getLocation().equals(loc)) {
			listFinal.add(list.get(i));
		}
	}
	return listFinal;
}
@GetMapping("/sort/{order}")
public List<Job> getbyorder(@PathVariable String order){
	return jr.findAll(Sort.by(order));
	
}








@PostMapping("/")
public List<Job>post(@RequestBody Job j){
	jr.save(j);
	return jr.findAll();
}
@PutMapping("/")
public List<Job>put(@RequestBody Job je){
	jr.save(je);
	return jr.findAll();
}
@DeleteMapping("/{id}")
public List<Job>delete(@PathVariable int id){
	jr.deleteById(id);
	return jr.findAll();
}
}
