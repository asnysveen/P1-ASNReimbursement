package com.revature.p1backend.service;

import java.util.List;

import com.revature.p1backend.model.Reimbursement;

public interface ReimbursementService {

	public List<Reimbursement> getAll();

	public Reimbursement getById(int id);

	public List<Reimbursement> getPending();

	public List<Reimbursement> getApproved();

	public Reimbursement updateStatus(int id,int status);
	
	public List<Reimbursement> getByAuthor(int id);

}
