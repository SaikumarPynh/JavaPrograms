package com.example.lab5pract;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public class Product {
@NotNull(message="id should not be blank")
@Min(1)
@Max(100)
private long ppid;
@NotNull(message="Name should bot null")
private String pname;
@NotNull(message="Name should bot blank")
private long pprice;
public long getPpid() {
	return ppid;
}
public void setPpid(long ppid) {
	this.ppid = ppid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public long getPprice() {
	return pprice;
}
public void setPprice(long pprice) {
	this.pprice = pprice;
}
}