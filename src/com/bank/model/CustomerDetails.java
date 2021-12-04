package com.bank.model;
public class CustomerDetails {
long accountNo;
String name;
String address;
Long mob;
Double availBalace;
Double depoAmount;

public CustomerDetails() {
	super();
}
public CustomerDetails(long accountNo, String name, String address, Long mob, Double availBalace, Double depoAmount) {
	super();
	this.accountNo = accountNo;
	this.name = name;
	this.address = address;
	this.mob = mob;
	this.availBalace = availBalace;
	this.depoAmount = depoAmount;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getMob() {
	return mob;
}
public void setMob(Long mob) {
	this.mob = mob;
}
public Double getAvailBalace() {
	return availBalace;
}
public void setAvailBalace(Double availBalace) {
	this.availBalace = availBalace;
}
public Double getDepoAmount() {
	return depoAmount;
}
public void setDepoAmount(Double depoAmount) {
	this.depoAmount = depoAmount;
}

}
