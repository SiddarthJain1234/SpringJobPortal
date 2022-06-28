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

import com.atcs.SpringJobPortal.Entity.User;
import com.atcs.SpringJobPortal.Repo.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
UserRepo ur;

@GetMapping("/")
public List<User>get(){
	return ur.findAll();
}
@PostMapping("/")
public List<User> post(@RequestBody User e){
	ur.save(e);
	return ur.findAll();
}
@PutMapping("/")
public List<User> put(@RequestBody User ea){
	ur.save(ea);
	return ur.findAll();
}
@DeleteMapping("/{id}")
public List<User> delete(@PathVariable int id){
	ur.deleteById(id);
	return ur.findAll();
}
}
