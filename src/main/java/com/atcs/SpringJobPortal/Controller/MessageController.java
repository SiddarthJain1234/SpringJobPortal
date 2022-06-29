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

import com.atcs.SpringJobPortal.Entity.Message;
import com.atcs.SpringJobPortal.Repo.MessageRepo;

@RestController
@RequestMapping("/msg")
public class MessageController {
@Autowired
MessageRepo mr;

@GetMapping("/")
public List<Message> get(){
	return mr.findAll();
}
@PostMapping("/")
public List<Message> post(@RequestBody Message m){
	mr.save(m);
	return mr.findAll();
}
@PutMapping("/")
public List<Message> put(@RequestBody Message m){
	mr.save(m);
	return mr.findAll();
}
@DeleteMapping("/{message_id}")
public List<Message> delete(@PathVariable int id){
 mr.deleteById(id);
 return mr.findAll();
}
}
