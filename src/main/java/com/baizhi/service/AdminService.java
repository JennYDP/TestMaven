package com.baizhi.service;

import com.baizhi.entity.Admin;

import java.util.List;

public interface AdminService {
	
	//���
	Admin login(String name, String password);
	
	List<Admin> findAll();
	
	//��֤�û���
	Admin findName(String name);
	
	void addAdmin(Admin admin);

	void modifyAdmin(Admin admin);
	
	void modifyLevel(Admin admin);
}
