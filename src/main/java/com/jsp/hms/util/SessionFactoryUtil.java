package com.jsp.hms.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.hms.entity.AppointmentDetails;
import com.jsp.hms.entity.DoctorInfo;
import com.jsp.hms.entity.PatientInfo;

public class SessionFactoryUtil {

	private static SessionFactory factory=null;
	
	private SessionFactoryUtil() {
		
	}

	public static SessionFactory getSessionfactory() {
		if(factory==null) {
			Configuration configuration=new Configuration();
			configuration.setProperties(ConnectionProperties.getConnectionProperties());
			configuration.addAnnotatedClass(PatientInfo.class);
			configuration.addAnnotatedClass(DoctorInfo.class);
			configuration.addAnnotatedClass(AppointmentDetails.class);
			factory=configuration.buildSessionFactory();
		}
		return factory;
	}

}
