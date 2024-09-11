package com.hexa.random.com.hexa.ran;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="USER_DETAIL")
public class Stud {
 
@Id
@Column(name="USER_ID")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
 
@Column(name="USER_NAME")
private String userName;
 
@OneToOne
@JoinColumn(name="VEHICLE_ID")
private Certificate vehicle;
 
public int getUserId() {
	return userId;
}
 
public String getUserName() {
	return userName;
}
 
public Certificate getVehicle() {
	return vehicle;
}
 
public void setUserId(int userId) {
	this.userId = userId;
}
 
public void setUserName(String userName) {
	this.userName = userName;
}
 
public void setVehicle(Certificate vehicle) {
	this.vehicle = vehicle;
}
}