package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<T> {
	//���
	void insertItem(T t);
	
	//ɾ��
	void deleteItem(T t);
	
	//����
	void updateItem(T t);
	
	//��ѯ����
	List<T> queryAll();
	
	//��ѯһ��
	T queryItem(T t);
	
	//��ҳ��ѯ
	List<T> page(@Param("begin") Integer begin, @Param("rows") Integer rows);
	
	//������
	Integer totalCount();

	
}
