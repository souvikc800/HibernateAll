package com.jwt.hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.lname="Dell";
		
		Emp e=new Emp();
		e.name="souvik";
		e.l=l1;
		
		Configuration c=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.saveOrUpdate(e);
		s.getTransaction().commit();
		s.close();
		
		
	}

}
