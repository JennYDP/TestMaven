package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;


public interface AdminDao extends BaseDao<Admin> {

	//���
	Admin login(@Param("name") String name, @Param("password") String password);
	
	//�޸Ĺ���T���e
	void updateLevel(Admin admin);
	
	//��֤�û���
	Admin queryName(String name);
}
