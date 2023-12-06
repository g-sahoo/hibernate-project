package com.jsp.hms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "appointment_details")
public class AppointmentDetails implements Serializable {

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "auto_get", strategy = "increment")
	@GeneratedValue(generator = "auto_get")
	private long id;
	@Column(name = "p_id")
	private long pId;
	@Column(name = "d_id")
	private long dId;
	@Column(name = "appointment_date")
	private Date appointmentDate;
	@Column(name = "remarks")
	private String remarks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public long getdId() {
		return dId;
	}

	public void setdId(long dId) {
		this.dId = dId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AppointmentDetails [id=" + id + ", pId=" + pId + ", dId=" + dId + ", appointmentDate=" + appointmentDate
				+ ", remarks=" + remarks + "]";
	}
	
	

}
