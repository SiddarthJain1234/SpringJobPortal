package com.atcs.SpringJobPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atcs.SpringJobPortal.Entity.Company;

public interface CompanyRepo extends JpaRepository<Company,Integer>{

}
