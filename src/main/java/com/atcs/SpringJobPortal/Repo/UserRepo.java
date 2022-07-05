package com.atcs.SpringJobPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atcs.SpringJobPortal.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	
}
