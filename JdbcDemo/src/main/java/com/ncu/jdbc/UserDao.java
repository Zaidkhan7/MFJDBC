package com.ncu.jdbc;

import java.util.List;

import com.ncu.model.ModelDemo;

public interface UserDao {

	public void SaveprUpdate(ModelDemo modeldemo);
	
	public void delete(String email);
	
	public ModelDemo get(String email);
	
	public List<ModelDemo> list();

	public void add(ModelDemo modeldemo);
}
