package com.sshe.beans;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by chenxyz on 2014/4/27.
 */
@Entity
@Table(name = "tuser", schema = "", catalog = "sshe")
public class TuserVo {
	private String id;
	private String name;
	private String pwd;
	private Date createdatetime;
	private Date modifydatetime;

	public void setCreatedatetime(Timestamp createdatetime) {
		this.createdatetime = createdatetime;
	}

	public void setModifydatetime(Timestamp modifydatetime) {
		this.modifydatetime = modifydatetime;
	}

	@Id
	@Column(name = "id", nullable = false, insertable = true, updatable = true, length = 80)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Basic
	@Column(name = "name", nullable = true, insertable = true, updatable = true, length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "pwd", nullable = true, insertable = true, updatable = true, length = 80)
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Basic
	@Column(name = "createdatetime", nullable = true, insertable = true, updatable = true)
	public Date getCreatedatetime() {
		return createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	@Basic
	@Column(name = "modifydatetime", nullable = true, insertable = true, updatable = true)
	public Date getModifydatetime() {
		return modifydatetime;
	}

	public void setModifydatetime(Date modifydatetime) {
		this.modifydatetime = modifydatetime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TuserVo tuserVo = (TuserVo) o;

		if (createdatetime != null ? !createdatetime.equals(tuserVo.createdatetime) : tuserVo.createdatetime != null)
			return false;
		if (id != null ? !id.equals(tuserVo.id) : tuserVo.id != null) return false;
		if (modifydatetime != null ? !modifydatetime.equals(tuserVo.modifydatetime) : tuserVo.modifydatetime != null)
			return false;
		if (name != null ? !name.equals(tuserVo.name) : tuserVo.name != null) return false;
		if (pwd != null ? !pwd.equals(tuserVo.pwd) : tuserVo.pwd != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
		result = 31 * result + (createdatetime != null ? createdatetime.hashCode() : 0);
		result = 31 * result + (modifydatetime != null ? modifydatetime.hashCode() : 0);
		return result;
	}
}
