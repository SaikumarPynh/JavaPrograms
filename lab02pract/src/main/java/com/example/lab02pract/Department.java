package com.example.lab02pract;

public class Department {
int Did;
String DName;
College college;
public Department(College college) {
	super();
	this.college = college;
}
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
public int getDid() {
	return Did;
}
public void setDid(int did) {
	Did = did;
}
public String getDName() {
	return DName;
}
public void setDName(String dName) {
	DName = dName;
}


}
