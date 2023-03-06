package com.skan.hibernateresto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
	  
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.skan.hibernateresto");
		context.refresh();
		
		for(String s : context.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		
		// (new Application()).process();
	
        Application app = context.getBean(Application.class);
        app.process();
        
        // close the spring context
        context.close();
	}
	

}