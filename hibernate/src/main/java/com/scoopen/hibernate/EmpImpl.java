package com.scoopen.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		
		Employee e=new Employee();
		e.setEid(1);
		e.setName("Hanuman");
		e.setCity("Pune");
		e.setSalary((long) 50000);
		
		SessionFactory sfs=cfg.buildSessionFactory();
		Session ss=sfs.openSession();
		Transaction t=ss.beginTransaction();
		
		ss.save(e);
		t.commit();
		ss.close();
	}

}
