package com.jwt.hibernate.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.lname="Dell";
		
		Laptop l2=new Laptop();
		l2.lname="HP";
		
		Emp e1=new Emp();
		e1.name="souvik";
		List<Laptop> list=new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		e1.l=list;
		
		l1.e=e1;
		l2.e=e1;
		
		Configuration c=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.save(l1);
		s.save(l2);
		s.saveOrUpdate(e1);
		s.getTransaction().commit();
		s.close();
		
		
	}

}
