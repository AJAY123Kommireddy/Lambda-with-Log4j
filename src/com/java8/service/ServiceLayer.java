package com.java8.service;

import java.util.Collections;
import java.util.List;

import com.java8.daolayer.DaoLayer;
import com.java8.entity.CustomerEntity;

public class ServiceLayer {

	
	public List<CustomerEntity> fetchAllCustomerDetails(){
		
		    List<CustomerEntity> customers = new DaoLayer().getCustomerDetails();
		    
		     Collections.sort(customers,(o1,o2) -> (o2.getName().compareTo(o1.getName())));
		     
		     return customers;
	}
	
}
