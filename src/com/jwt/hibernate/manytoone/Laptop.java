package com.jwt.hibernate.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
	int l_id;
	String lname;
	
	@OneToMany(mappedBy="laptop")
	List<Emp> l;
	
}
