package com.hibernate.Demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parentDetails")
public class Parent {
	
	@Id
	private int p_id;
	private String pName;
	
	@OneToMany
	private List<Child> child;
	
	public Parent() {
		super();
	}

	public Parent(int p_id, String pName, List<Child> child) {
		super();
		this.p_id = p_id;
		this.pName = pName;
		this.child = child;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Child> getChild() {
		return child;
	}

	public void setChild(ArrayList<Child> list) {
		this.child = (List<Child>) list;
	}

	@Override
	public String toString() {
		return "Parent [p_id=" + p_id + ", pName=" + pName + ", child=" + child + "]";
	}

	

	
	
	
}
