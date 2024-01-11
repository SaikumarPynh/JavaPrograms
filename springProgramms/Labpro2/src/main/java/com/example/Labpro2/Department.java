package com.example.Labpro2;

public class Department {
	String Department_name,Department_address;
	College college_info;
	public Department(College college_info) {
		this.college_info = college_info;
		
	}
	
	public String getDepartment_name() {
		return Department_name;
	}
	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}
	public String getDepartment_address() {
		return Department_address;
	}
	public void setDepartment_address(String department_address) {
		Department_address = department_address;
	}

	public void setCollege_info(College college_info) {
		this.college_info = college_info;
	}
	public College getCollege_info() {
		// TODO Auto-generated method stub
		return college_info;
	}
	

}
