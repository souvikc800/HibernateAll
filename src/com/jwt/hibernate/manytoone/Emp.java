package com.jwt.hibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	@GeneratedValue
	int emp_id;
	String name;
	
	@ManyToOne
	@JoinColumn(name="l_id")
	Laptop laptop;
	

}
