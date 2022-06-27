package com.atcs.SpringJobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.SpringJobPortal.Entity.Company;
import com.atcs.SpringJobPortal.Repo.CompanyRepo;

@RestController
@RequestMapping("/company")
public class CompanyController {
@Autowired 
CompanyRepo cr;

@GetMapping("/")
public List<Company> get(){
	return cr.findAll();
}
@PostMapping("/")
public List<Company> post(@RequestBody Company c){
	cr.save(c);
	return cr.findAll();
}
@PutMapping("/")
public List<Company> put(@RequestBody Company r){
	cr.save(r);
	return cr.findAll();
}
@DeleteMapping("/{id}")
public List<Company> delete(@PathVariable int id){
	cr.deleteById(id);
	return cr.findAll();
}
}
