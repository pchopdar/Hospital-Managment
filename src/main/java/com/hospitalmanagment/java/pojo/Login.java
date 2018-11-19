package com.hospitalmanagment.java.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login implements Serializable {
	
	@Id
	private String mobileno;
	@Column
	private String passcode;
	@Column
	private String role;
	@Column
	private String name;
	
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Login(String mobileno, String passcode, String role,String name) {
		super();
		this.mobileno = mobileno;
		this.passcode = passcode;
		this.role = role;
		this.name = name;
	}
	public Login() {
		super();
	}
	@Override
	public String toString() {
		return "Login [mobileno=" + mobileno + ", passcode=" + passcode + ", role=" + role + ", name=" + name +"]";
	}

}