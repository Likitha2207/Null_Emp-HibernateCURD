package com.emps.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.emps.main.Employee;

public class HibernateUtil {
	static SessionFactory sessionfactory=null;
	
	public static SessionFactory buildSessionFactory() {
		if(sessionfactory!=null) {
			return sessionfactory=null;
		}
		Configuration cfg=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class);
		
	sessionfactory=cfg.buildSessionFactory();
	return sessionfactory;
	}

}
