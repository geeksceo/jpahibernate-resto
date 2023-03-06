package com.skan.hibernateresto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skan.hibernateresto.dao.UserDao;
import com.skan.hibernateresto.entity.User;

public class Main {
	
	
	public static void main(String[] args) {
	  
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.skan.hibernateresto");
		context.refresh();
		
		for(String s : context.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		
		// (new Application()).process();
	
        // UserDao userDao = context.getBean(UserDao.class);
        
        // few test
       //  userDao.save(new User("geeksceostest", "oowashina@skanci.com"));
        
        
        // close the spring context
        context.close();
	}
	

}