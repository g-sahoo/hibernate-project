package com.jsp.hms.dto;

public class AppointmentDto {

	private long patientId;
	
	private long doctorId;
	
	private String appointmentDate;
	
	private String time;

	public long getPatientId() {
		return patientId;
	}

	
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
