package com.ts.amethyst.logic;

import java.io.Serializable;
import java.util.Date;

public class TmpBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String createUser;

	private Date createDate;

	private String updateUser;

	private Date  updateDate;

	private Integer deleteFlg;


	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setupdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getDeleteFlg() {
		return this.deleteFlg;
	}

	public void setDeleteFlg(Integer deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
}