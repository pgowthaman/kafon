package com.niit.kafonbackend;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class TestCategory {

		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit");
			
			context.refresh();
			
			context.getBean("category");
			
			System.out.println("The instances are created successfully");

		}

	}



