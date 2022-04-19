package com.revature.p1backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p1backend.model.Reimbursement;
import com.revature.p1backend.repo.ReimbursementRepository;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	ReimbursementRepository reimbursementRepository;

	@Override
	public List<Reimbursement> getAll() {
		// TODO Auto-generated method stub
		return reimbursementRepository.findAll();
	}

	@Override
	public Reimbursement getById(int id) {
		// TODO Auto-generated method stub
		return reimbursementRepository.findById(id).get();
	}

	@Override
	public List<Reimbursement> getPending() {
		// TODO Auto-generated method stub
		return reimbursementRepository.getByStatus(1);
	}

	@Override
	public List<Reimbursement> getApproved() {
		// TODO Auto-generated method stub
		return reimbursementRepository.getByStatus(3);
	}

	public Reimbursement updateStatus(int id, int status) {
		Reimbursement reimburse = null;
		reimburse = getById(id);
		if (reimburse != null) {
			reimburse.setStatus(status);
			reimbursementRepository.save(reimburse);
		}
		return reimburse;
	}

	@Override
	public List<Reimbursement> getByAuthor(int id) {
		// TODO Auto-generated method stub
		return reimbursementRepository.getByAuthor(id);
	}
}
