package com.jsp.hms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.jsp.hms.dao.HospitalManagementImpl;
import com.jsp.hms.dto.AppointmentDto;
import com.jsp.hms.dto.DoctorDto;
import com.jsp.hms.dto.PatientDto;
import com.jsp.hms.entity.AppointmentDetails;
import com.jsp.hms.util.ConverToDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
        HospitalManagementImpl hms=new HospitalManagementImpl();
//        
//        PatientDto patient=new PatientDto();
//        patient.setName("sidharth");
//        patient.setEmail("sidharth@gmail.com");
//        patient.setContact("9858785421");
       // hms.create(patient);
        
//        DoctorDto doctor=new DoctorDto();
//        doctor.setName("dr.wasikaran");
//        doctor.setEmail("wasikaran@gmail.com");
//        doctor.setContact("9125697411");
//        doctor.setType("orthopadic");
//        doctor.setAvailabelTime("12,13");
       // hms.create(doctor);
        
//        AppointmentDto appointment=new AppointmentDto();
//        appointment.setPatientId(7);
//        appointment.setDoctorId(2);
//        appointment.setAppointmentDate("09-10-2023");
//        hms.create(appointment);
        
        //hms.create(appointment);
       // hms.updatePatientContactByemail("7357431689", "arun@gmail.com");
       
        List<AppointmentDetails> list = hms.getAllAppointmentByDoctorIdAndDate(2, ConverToDate.getDate("06-01-2023"));
       Iterator<AppointmentDetails> iterator = list.iterator();
       while(iterator.hasNext()) {
    	   System.out.println(iterator.next());
       }
       
       hms.updateRemarksByPatientId(7, "chest pain", ConverToDate.getDate("09-10-2023"));
        
        
    }
}
