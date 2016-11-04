package com.niit.kafon.dao;

import java.util.List;

import com.niit.kafon.model.Product;

public interface ProductDAO {
public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id); 
	
	public List<Product> list();

}
