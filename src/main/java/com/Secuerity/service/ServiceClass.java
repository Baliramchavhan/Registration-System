package com.Secuerity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Secuerity.StudentRepositery;
import com.Secuerity.EntitiyLiyer.StudentSecuerity;
@Service
public class ServiceClass {
	@Autowired
	StudentRepositery studentrepo;
	
	
	public void SaveStudent(StudentSecuerity EntityClass) {
		EntityClass.setPassword(EntityClass.getPassword());
		studentrepo.save(EntityClass);
		
		
	}
	StudentSecuerity FindByUserName(String user) {
		return studentrepo.findByemail(user);
	}
	

}
