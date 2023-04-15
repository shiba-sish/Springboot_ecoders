package com.example.ecoders.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "employee")
@Entity
public class Employee {

public int getId() {
		return id;
}
public void setId(int id) {
this.id = id;
}
public String getEmailid() {
return emailid;
}
public void setEmailid(String emailid) {
this.emailid = emailid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return emailid;
}
public void setEmail(String emailid) {
	this.emailid = emailid;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid + "]";
}
Employee() {
}
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name= "id")
private int id;
@Column(name= "firstname")
private String firstname;
@Column(name= "lastname")
private String lastname;
@Column(name= "emailid")
private String emailid;
public Employee(String firstname, String lastname, String emailid) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailid = emailid;
}

}
