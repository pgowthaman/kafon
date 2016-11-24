package com.niit.kafonbackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.kafonbackend.dao.SupplierDAO;
import com.niit.kafonbackend.model.Supplier;



public class SupplierTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Supplier supplier;
	
	@Autowired
	static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.kafon");
		context.refresh();
		
		 supplierDAO =(SupplierDAO) context.getBean("supplierDAO");
		
		 supplier =(Supplier) context.getBean("supplier");
		
		System.out.println("the objectes are created");
	}
	
	//start writing Junit Test cases
	//For each method defined in DAO
	
	@Test//to make it as test case
	public void createsupplierTestCase()
	{
		supplier.setId("BOOK_07");
		supplier.setAddress("This is book supplier");
		supplier.setName("book supplier");
		
		Boolean status = supplierDAO.save(supplier);
		
		Assert.assertEquals("Create supplier Test Case", true, status);
	}
	
	@Test 
	public void deletesupplierTestCae()
	{
		supplier.setId("BOOK_07");
		Boolean status = supplierDAO.delete(supplier);
		Assert.assertEquals("Delete supplier Test Case", true, status);
	}
	
	@Test
	public void updatesupplierTestCase()
	{
		supplier.setId("BOOK_07");
		supplier.setAddress("This is book supplier");
		Boolean status = supplierDAO.update(supplier);
		Assert.assertEquals("Update supplier Test Case", true, status);
	}
	@Test
	public void getsupplierTestCase()
	{
		Assert.assertEquals("get supplier Test Case", null , supplierDAO.get("abcd"));
	}
	@Test
	public void getAllsupplierTestCase()
	{
		Assert.assertEquals("get all supplier Test Case", 12 , supplierDAO.list().size());
	}

}
