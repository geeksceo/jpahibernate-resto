package com.skan.hibernateresto;

import java.util.Scanner;

import com.skan.hibernateresto.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AskData2 {
	
	public static User user() {
		 System.out.println("Enter username : ");
		return null;
		 
	}

  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  boolean response = false;
	  int choice = 0;
	  
	  do {
		  System.out.println("-------------------------");
		  System.out.println("---------Menu------------");
		 
		  System.out.println("1. Create new user");
		  System.out.println("2. Create new receipt");
		  System.out.println("3. Retrieve a user data");
		  System.out.println("4. Retrieve a receipt data");
		  System.out.println("5. Retrieve all users datum");
		  System.out.println("6. Retrieve all receipts datum");
		  choice = sc.nextInt();
		  
		  if(choice < 1 || choice > 6)
			  continue;
		  
		  switch(choice) {
			  case 1:
			  		break;
			  case 2:
			  		break;
			  case 3:
			  		break;
			  case 4:
			  		break;
			  case 5:
			  		break;
			  case 6:
			  		break;
		  }
		 
		 
	  } while (response != true);

	 
  }
}