package com.java8;

import org.apache.log4j.BasicConfigurator;

import com.java8.service.ServiceLayer;

public class MainClassLambda {

	public static void main(String[] args) {
		 BasicConfigurator.configure(); 

	        
		
		ServiceLayer sortedcostomers = new ServiceLayer();
		
		System.out.println(sortedcostomers.fetchAllCustomerDetails());
	}
	
	
	
	
}
