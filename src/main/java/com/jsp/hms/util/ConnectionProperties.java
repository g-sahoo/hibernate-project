package com.jsp.hms.util;

import java.util.Properties;

import org.hibernate.cfg.Environment;

public class ConnectionProperties {

	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/operational_db");
		properties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.setProperty(Environment.USER, "root");
		properties.setProperty(Environment.PASS, "root");
		properties.setProperty(Environment.SHOW_SQL, "true");
	// 	properties.setProperty(Environment.DIALECT, "org.hibernate.mysql8Dialect.class");
		//Dialect resolution  exception
		return properties;
	}
}
