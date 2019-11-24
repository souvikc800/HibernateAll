package com.jwt.hibernate.manytomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.name="souvik";
		
		Emp e2=new Emp();
		e2.name="baban";
		
		Laptop l1=new Laptop();
		l1.lname="DELL";
		
		Laptop l2=new Laptop();
		l2.lname="HP";
		
		Laptop l3=new Laptop();
		l3.lname="MAC";
		
		List<Emp> e_list1=new ArrayList<Emp>();
		e_list1.add(e1);
		
		List<Emp> e_list2=new ArrayList<Emp>();
		e_list2.add(e1);
		e_list2.add(e2);
		
		
		
		l1.emp_list=e_list1;
		
		
		List<Laptop> l_list1=new ArrayList<Laptop>();
		l_list1.add(l1);
		l_list1.add(l2);
		
		List<Laptop> l_list2=new ArrayList<Laptop>();
		l_list2.add(l2);
		l_list2.add(l3);
		
		e1.laptop_list=l_list1;
		e2.laptop_list=l_list2;
		
		l2.emp_list=e_list2;
		
		Configuration c=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.save(l1);
		s.save(l2);
		s.save(l3);
		s.save(e1);
		s.save(e2);
		
		s.getTransaction().commit();
		s.close();
		
		
	}

}
