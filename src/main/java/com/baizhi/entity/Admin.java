package com.baizhi.entity;

import java.io.Serializable;

public class Admin implements Serializable {

	  private String id; //管理员id
	  private String name; // 账号
	  private String password; //密码
	  private Integer level;//权限
	  
	  
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String id, String name, String password, Integer level) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password
				+ ", level=" + level + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	  
	  
}
