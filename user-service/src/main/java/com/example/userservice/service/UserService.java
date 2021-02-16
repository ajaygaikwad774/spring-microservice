package com.example.userservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.userservice.model.User;
import com.example.userservice.model.vo.DepartmentVo;
import com.example.userservice.model.vo.ResponseTemplateVo;
import com.example.userservice.respository.UserRespository;

@Service
@Transactional
public class UserService {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserRespository userRespository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public User save(User user) {
		log.info("Inside Save User Service");
		return userRespository.save(user);
	}
	

	
	public ResponseTemplateVo getUserWithDepartment(Long id) {
		log.info("Inside User By Id Service ");
		ResponseTemplateVo responseTemplateVo = new ResponseTemplateVo();
		User user = userRespository.findUserById(id);
		System.out.println("Department Id "+user.getDepartmentId());
		DepartmentVo department = restTemplate.getForObject("http://department-ws/department/get/"+user.getDepartmentId(), DepartmentVo.class);
		responseTemplateVo.setUser(user);
		responseTemplateVo.setDepartment(department);
		return responseTemplateVo;
	}
	
	
	
}
