package com.qship.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class T_rucks {
	@Id
	private int tid;
	private String regno;
	private String departedFrom;
	private String arrivalAt;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	private String driver;
	
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getDepartedFrom() {
		return departedFrom;
	}
	public void setDepartedFrom(String departedFrom) {
		this.departedFrom = departedFrom;
	}
	public String getArrivalAt() {
		return arrivalAt;
	}
	public void setArrivalAt(String arrivalAt) {
		this.arrivalAt = arrivalAt;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	

}
