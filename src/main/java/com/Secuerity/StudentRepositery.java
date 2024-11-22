package com.Secuerity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Secuerity.EntitiyLiyer.StudentSecuerity;

public interface StudentRepositery extends JpaRepository<StudentSecuerity, Integer>{
	StudentSecuerity findByemail(String email);

}
