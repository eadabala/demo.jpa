package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Emp;
import com.example.demo.repo.EmpRepo;

@RestController
@RequestMapping("/emp") //http://localhost:8085/emp
public class EmpController {
	
	@Autowired
	EmpRepo empRepo;
	
	@PostMapping
	public void createEmp(@RequestBody Emp emp) {
		empRepo.save(emp);
	}
	
	@GetMapping
	public List<Emp> getEmpList() {
		return empRepo.findAll();
	}
}
