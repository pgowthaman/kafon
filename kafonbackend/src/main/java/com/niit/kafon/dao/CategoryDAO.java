package com.niit.kafon.dao;

import java.util.List;

import com.niit.kafon.model.Category;



public interface CategoryDAO {
	
	//CRUD Operations create save update delete 
	
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category get(String id); //it is used to get all the fields in a category using primary key
	
	public List<Category> list();
	
}
