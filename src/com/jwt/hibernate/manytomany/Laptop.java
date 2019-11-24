package com.jwt.hibernate.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
	int l_id;
	String lname;
	@ManyToMany
	@JoinColumn(name="emp_id")
	List<Emp> emp_list;
	
}
