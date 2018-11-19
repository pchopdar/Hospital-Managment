package com.hospitalmanagment.java.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.hospitalmanagment.java.pojo.Login;
import com.hospitalmanagment.java.repo.LoginRepo;

@Component
@Service
public class LoginService {
	
	@Autowired
	LoginRepo repo;
	
	
	Login user=new Login();

    public String validateUser(String mobileno, String passcode ) {
        user.setMobileno(mobileno);
        user.setPasscode(passcode);
    	
        System.out.println(user.getMobileno());
        
    	String role1=(String) repo.findByRole(mobileno,passcode);
    	user.setRole(role1);
    	System.out.println("Current role of user  "+user.getRole());
    	
    	if(role1.equals("admin")) {
    		System.out.println("Current role of user in IF "+user.getRole());
    		return "welcome";}
    	else
    		{
    		System.out.println("Current role of user in Error "+user.getRole());
    		return "error";}
    		
       /* return userid.equalsIgnoreCase("in28minutes")
                && password.equalsIgnoreCase("dummy");*/
    }

    private Object getJdbcTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	
    
    public List<Login> getLoginDetails() {
		
    	List list =new ArrayList<Login>(); 
    		
    		list =(List) repo.findAll();
    		
    		return list;
    		
    	}
    
}


