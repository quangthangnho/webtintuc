package com.websitetintuc.model;

import java.sql.Timestamp;

public class AbstractModel {
	private long id;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private Timestamp createdBy;
	private Timestamp modifiedBy;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Timestamp getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Timestamp createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Timestamp modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
