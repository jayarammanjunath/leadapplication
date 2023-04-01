package com.example.leadapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leadapp.entite.Leads;
import com.example.leadapp.repository.LeadRepositorys;

@Service
public class LeadServicesImpl implements LeadsService {
	@Autowired
	private LeadRepositorys leadrepoobj;

	@Override
	public void saveOneLeadDetail(Leads lead) {
		leadrepoobj.save(lead);
	}

}
