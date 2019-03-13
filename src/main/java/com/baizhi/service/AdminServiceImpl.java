package com.baizhi.service;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public Admin login(String name, String password) {
		Admin loginAdmin = adminDao.login(name, password);
		
		return loginAdmin;
	}
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Admin> findAll() {
		List<Admin> listAdmin = adminDao.queryAll();
		return listAdmin;
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public Admin findName(String name) {
		Admin queryName = adminDao.queryName(name);
		System.out.println("edit Girhub");
		return queryName;
	}

	@Override
	public void addAdmin(Admin admin) {

		adminDao.insertItem(admin);
	}

	@Override
	public void modifyAdmin(Admin admin) {

		adminDao.updateItem(admin);
	}

	@Override
	public void modifyLevel(Admin admin) {
		adminDao.updateLevel(admin);

	}

	

}
