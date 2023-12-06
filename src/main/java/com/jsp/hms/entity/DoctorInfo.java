package com.jsp.hms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "doctor_info")
public class DoctorInfo implements Serializable{

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "contact")
	private String contact;
	@Column(name = "type")
	private String type;
	@Column(name = "available_time")
	private String availabelTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAvailabelTime() {
		return availabelTime;
	}

	public void setAvailabelTime(String availabelTime) {
		this.availabelTime = availabelTime;
	}

	@Override
	public String toString() {
		return "DoctorInfo [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", type="
				+ type + ", availabelTime=" + availabelTime + "]";
	}

	
}
