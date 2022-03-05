package com.yashwanth.hibernateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")

public class TestingMyProcess {
	@Id
	@Column(name = "ID")
	private int ID;
	@Column(name = "NAME")
	private String NAME;
	@Column(name = "LOCATION")
	private String LOCATION;
	@Override
	public String toString() {
		return "TestingMyProcess [ID=" + ID + ", NAME=" + NAME + ", LOCATION=" + LOCATION + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getLOCATION() {
		return LOCATION;
	}
	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}



}
