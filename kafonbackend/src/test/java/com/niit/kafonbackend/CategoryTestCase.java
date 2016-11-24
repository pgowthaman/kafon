package com.niit.kafonbackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.kafonbackend.dao.CategoryDAO;
import com.niit.kafonbackend.model.Category;



public class CategoryTestCase 
{
	public CategoryTestCase() 
	{
	}
@Autowired
static AnnotationConfigApplicationContext context;

@Autowired
static Category category;
@Autowired
static CategoryDAO categoryDAO;

@BeforeClass
@Autowired
public static void init()
{
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit");		
    context.refresh();
    
     categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
     category=(Category)context.getBean("category");
    System.out.println("the object are created");

}

@Test
public void createCategoryTestCase()
{
	category.setId("123");
	category.setDescription("Mo");
	category.setName("mob");
	Boolean status =categoryDAO.save(category);
	Assert.assertEquals("createCategoryTestCase",true,status);
}
@Test
public void deleteCategoryTestCase()
{
	category.setId("123");
	boolean status=categoryDAO.delete(category);
	Assert.assertEquals("Delete Category test case",true,status);
}

}
