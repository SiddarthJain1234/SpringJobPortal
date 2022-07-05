package com.atcs.SpringJobPortal.Repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atcs.SpringJobPortal.Entity.Job;



public interface JobRepo extends JpaRepository<Job,Integer> {
   
       
	
}
