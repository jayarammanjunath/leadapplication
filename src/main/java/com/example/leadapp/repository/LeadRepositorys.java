package com.example.leadapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.leadapp.entite.Leads;

public interface LeadRepositorys extends JpaRepository<Leads, Long> {
	

}
