package com.jwt.hibernate.manytoone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.lname="DELL";
				
		Emp e1=new Emp();
		e1.name="Souvik";
		
		Emp e2=new Emp();
		e2.name="Baban";
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		
		l1.l=list;
		
		e1.laptop=l1;
		e2.laptop=l1;
		
		
		
		
		
		
		Configuration c=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.save(e1);
		s.save(e2);
		s.save(l1);
		s.getTransaction().commit();
		s.close();
		
		
	}

}
