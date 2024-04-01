package com.example.lab01pract;

public class Customer {
int Custid;
String CName,CAddress;
Ticket tick;
public Ticket getTick() {
	return tick;
}
public void setTick(Ticket tick) {
	this.tick = tick;
}
public int getCustid() {
	return Custid;
}
public void setCustid(int custid) {
	Custid = custid;
}
public String getCName() {
	return CName;
}
public void setCName(String cName) {
	CName = cName;
}
public String getCAddress() {
	return CAddress;
}
public void setCAddress(String cAddress) {
	CAddress = cAddress;
}

}
