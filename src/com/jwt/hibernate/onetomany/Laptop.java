package com.jwt.hibernate.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
	int l_id;
	String lname;
	@ManyToOne
	@JoinColumn(name="emp_id")
	Emp e;
	public int getLid() {
		return l_id;
	}
	public void setLid(int lid) {
		this.l_id = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + l_id + ", lname=" + lname + "]";
	}
	
}
