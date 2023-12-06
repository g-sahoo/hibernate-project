package com.jsp.hms.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.hms.dto.AppointmentDto;
import com.jsp.hms.dto.DoctorDto;
import com.jsp.hms.dto.PatientDto;
import com.jsp.hms.entity.AppointmentDetails;
import com.jsp.hms.entity.DoctorInfo;
import com.jsp.hms.entity.PatientInfo;
import com.jsp.hms.util.ConverToDate;
import com.jsp.hms.util.SessionFactoryUtil;

public class HospitalManagementImpl implements HospitalManagement {

	@Override
	public void create(PatientDto patientDto) {
		PatientInfo patient=new PatientInfo();
		patient.setName(patientDto.getName());
		patient.setEmail(patientDto.getEmail());
		patient.setContact(patientDto.getContact());
		
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(patient);
		transaction.commit();
	}

	@Override
	public void create(DoctorDto doctorDto) {
		DoctorInfo doctor=new DoctorInfo();
		doctor.setName(doctorDto.getName());
		doctor.setEmail(doctorDto.getEmail());
		doctor.setContact(doctorDto.getContact());
		doctor.setType(doctorDto.getType());
		doctor.setAvailabelTime(doctorDto.getAvailabelTime());
		
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(doctor);
		transaction.commit();
	}

	@Override
	public void create(AppointmentDto appointmentDto) {
		AppointmentDetails appointment=new AppointmentDetails();
		appointment.setpId(appointmentDto.getPatientId());
		appointment.setdId(appointmentDto.getDoctorId());
		appointment.setRemarks("NA");
		
		appointment.setAppointmentDate(ConverToDate.getDate(appointmentDto.getAppointmentDate()));
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(appointment);
		transaction.commit();
	}

	@Override
	public void updatePatientContactByemail(String contact, String email) {

		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		StringBuilder builder=new StringBuilder();
		builder.append("update PatientInfo set contact=:c ");
		builder.append("where email=:e ");
		Query query = session.createQuery(builder.toString());
		query.setParameter("c", contact);
		query.setParameter("e", email);
		query.executeUpdate();
		transaction.commit();
		
	}

	@Override
	public List<AppointmentDetails> getAllAppointmentByDoctorIdAndDate(long dId, Date date) {

		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		
		StringBuilder builder=new StringBuilder();
		builder.append("from AppointmentDetails " );
		builder.append("where dId=:d and appointmentDate=:dt");
	
		Query query = session.createQuery(builder.toString());
		query.setParameter("d", dId);
		query.setParameter("dt", date);
		List resultList = query.getResultList();
		
		return resultList;
	}

	@Override
	public void updateRemarksByPatientId(long pId, String remarks, Date appointmentDate) {
		
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		StringBuilder builder=new StringBuilder();
		builder.append("update AppointmentDetails set remarks=:r " );
		builder.append("where pId=:p and appointmentDate=:dt");
		Query query = session.createQuery(builder.toString());
		query.setParameter("p", pId);
		query.setParameter("dt", appointmentDate);
		query.setParameter("r", remarks);
		query.executeUpdate();
		transaction.commit();
	}
	
	
	
	

	
}
