package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="employeeR")
public class EmployeeRegistration {
    @Id @GeneratedValue
	private int empId;
	@NonNull
	private String empName;
	@NonNull
	private String empEmailId;
	@NonNull
	private String empPassword;
	@NonNull
	private String empDesignation;
	@NonNull
	private String empDob;
	@NonNull
	private String empCity;
	@NonNull
	private String empobilenum;
	@NonNull
	private String empGraduation,empPostgraduation,empGender,empSkills;
	
	
	


	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpobilenum() {
		return empobilenum;
	}
	public void setEmpobilenum(String empobilenum) {
		this.empobilenum = empobilenum;
	}
	public String getEmpGraduation() {
		return empGraduation;
	}
	public void setEmpGraduation(String empGraduation) {
		this.empGraduation = empGraduation;
	}
	public String getEmpPostgraduation() {
		return empPostgraduation;
	}
	public void setEmpPostgraduation(String empPostgraduation) {
		this.empPostgraduation = empPostgraduation;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(String empSkills) {
		this.empSkills = empSkills;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	@Override
	public String toString() {
		return "EmployeeRegistration [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId
				+ ", empPassword=" + empPassword + ", Designation=" + empDesignation + "]";
	}
	
	
	
}