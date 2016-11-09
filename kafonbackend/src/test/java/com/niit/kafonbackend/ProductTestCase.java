package com.niit.kafonbackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.kafon.dao.ProductDAO;
import com.niit.kafon.model.Product;



public class ProductTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Product product;
	
	@Autowired
	static ProductDAO productDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.kafon");
		context.refresh();
		
		 productDAO =(ProductDAO) context.getBean("productDAO");
		
		 product =(Product) context.getBean("product");
		
		System.out.println("the objectes are created");
	}
	
	//start writing Junit Test cases
	//For each method defined in DAO
	
	@Test//to make it as test case
	public void createproductTestCase()
	{
		product.setId("BOOK_07");
		product.setDescription("This is book product");
		product.setName("book product");
		
		Boolean status = productDAO.save(product);
		
		Assert.assertEquals("Create product Test Case", true, status);
	}
	
	@Test 
	public void deleteproductTestCae()
	{
		product.setId("BOOK_07");
		Boolean status = productDAO.delete(product);
		Assert.assertEquals("Delete product Test Case", true, status);
	}
	
	@Test
	public void updateproductTestCase()
	{
		product.setId("BOOK_07");
		product.setDescription("This is book product");
		Boolean status = productDAO.update(product);
		Assert.assertEquals("Update product Test Case", true, status);
	}
	@Test
	public void getproductTestCase()
	{
		Assert.assertEquals("get product Test Case", null , productDAO.get("abcd"));
	}
	@Test
	public void getAllproductTestCase()
	{
		Assert.assertEquals("get all product Test Case", 12 , productDAO.list().size());
	}

}
