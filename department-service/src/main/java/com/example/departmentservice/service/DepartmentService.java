package com.example.departmentservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.dao.DepartmentDao;
import com.example.departmentservice.model.Department;

@Service
@Transactional
public class DepartmentService {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	DepartmentDao departmentDao;

	public Department save(Department department) {
		log.info("Inside Save Department Service");
		return departmentDao.save(department);
	}
	
	public Department getDepartmentById(Long id) {
		log.info("Inside Department By Id Service ");
		return departmentDao.findDepartmentById(id);
	}
}
