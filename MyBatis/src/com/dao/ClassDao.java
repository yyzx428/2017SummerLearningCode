package com.dao;

import java.util.List;

public interface ClassDao {
	public com.model.Class findClassById(int id); 
	public List<com.model.Class> findAllClass(); 
	public int insertClass(com.model.Class classes);
	public int deleteClass(String classNum);
}
