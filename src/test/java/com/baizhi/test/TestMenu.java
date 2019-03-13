package com.baizhi.test;


import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring.xml")
public class TestMenu {

	@Autowired
	private AdminService adminService;

	@Test
	public void test(){
		List<Admin> all = adminService.findAll();
		for (Admin admin : all) {
			System.out.println(admin);
		}
	}
	


	
}
