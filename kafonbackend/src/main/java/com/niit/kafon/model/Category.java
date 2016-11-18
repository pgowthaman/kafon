package com.niit.kafon.model;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity			//This is not normal class we are going to map it to the table in database
@Table			//If the table name is same as class name, you no need to specify name or else
				//mention as(name="category")
@Component("category")		//It is used to create the instance of the class with same name as class name with 1st letter 
				//as smaller case
public class Category {
	@Id
	private String id;
	@Column(name="name")//Optional if the property name in this class is as same as field name in the table
	private String name;
	@Column(name="description")
    private String description;
	public Category()
	{
		
	}
	private Set<Product> products;
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		}



