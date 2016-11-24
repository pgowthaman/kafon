package com.niit.kafonbackend.dao;

import java.util.List;

import com.niit.kafonbackend.model.Supplier;

public interface SupplierDAO {

	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier get(String id); 
	
	public List<Supplier> list();
	
}
