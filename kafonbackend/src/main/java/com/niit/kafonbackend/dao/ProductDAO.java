package com.niit.kafonbackend.dao;

import java.util.List;

import com.niit.kafonbackend.model.Product;

public interface ProductDAO {
public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id); 
	
	public List<Product> list();

}
