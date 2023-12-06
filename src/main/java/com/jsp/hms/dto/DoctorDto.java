package com.jsp.hms.dto;

import javax.persistence.Column;

public class DoctorDto {

	private String name;
	
	private String email;
	
	private String contact;
	
	private String type;
	
	private String availabelTime;

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
	
}
