package com.revature.p1backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p1backend.model.Reimbursement;
import com.revature.p1backend.service.ReimbursementService;

@RestController
public class ReimbursementController {
	
	@Autowired
	ReimbursementService reimbursementService;

	@GetMapping("/reimbursement")
	public List<Reimbursement> getReimbursement() {
		return reimbursementService.getAll();
	}
	
	@GetMapping("/reimbursement/{id}")
	public Reimbursement reimbursementById(@PathVariable int id) {
		return reimbursementService.getById(id);
	}
	
	@PutMapping("/reimbursement/{id}")
	public Reimbursement updateReimbursement(@PathVariable int id, int status) {
		return null;
	}
	
	@GetMapping("/reimbursement/users/{authorId}")
	public List<Reimbursement> reimbursementByUser(@PathVariable int authorId) {
		return reimbursementService.getByAuthor(authorId);
	}
}
