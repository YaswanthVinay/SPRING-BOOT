package com.yashwanth.hibernate.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//(name ="College")
public class employee {

	@Id
	// @Column(name = "ID")
	private int ID;
	// @Column(name = "Name")
	private String NAME;

	// @Column(name ="College")
	private String LOCATION;

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
