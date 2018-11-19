package com.hospitalmanagment.java.repo;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.hospitalmanagment.java.pojo.Login;

public interface LoginRepo extends CrudRepository<Login,String> {
	
	 List<Login> findAll();
	
	
	@Query(value = "SELECT role FROM login t WHERE t.mobileno = ?1 and   t.passcode= ?2 ",
	            nativeQuery=true
	          )

	    public String findByRole(String mobileno,String passcode);
}

