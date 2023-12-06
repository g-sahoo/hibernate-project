package com.jsp.hms.dao;

import java.util.Date;
import java.util.List;

import com.jsp.hms.dto.AppointmentDto;
import com.jsp.hms.dto.DoctorDto;
import com.jsp.hms.dto.PatientDto;
import com.jsp.hms.entity.AppointmentDetails;

public interface HospitalManagement {
	
	public void create(PatientDto patientDto);
	public void create(DoctorDto DoctorDto);
	public void create(AppointmentDto patientDto);
	public void updatePatientContactByemail(String contact,String email);
	public List<AppointmentDetails> getAllAppointmentByDoctorIdAndDate(long dId,Date date);
	public void updateRemarksByPatientId(long pId,String remarks,Date appointmentDate);
}
