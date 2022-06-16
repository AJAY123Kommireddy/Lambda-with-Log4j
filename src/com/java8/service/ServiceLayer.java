package com.java8.service;

import java.util.*;
import java.util.List;

import com.java8.daolayer.DaoLayer;
import com.java8.entity.CustomerEntity;

public class ServiceLayer {

	
	public List<CustomerEntity> fetchAllCustomerDetails(){
		
		    List<CustomerEntity> customers = new DaoLayer().getCustomerDetails();
		    
		     Collections.sort(customers,new Mycomparator());
		     
		     return customers;
	}
	
	class Mycomparator implements Comparator<CustomerEntity>{
		
		public int compare(Object o1, Object o2){
		
			return (o2.getName().compareTo(o1.getName());
		}
		
	}
}
