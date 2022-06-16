package com.java8.daolayer;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.java8.entity.CustomerEntity;

public class DaoLayer {

	private static final Logger logger = Logger.getLogger(DaoLayer.class);

	public List<CustomerEntity> getCustomerDetails() {

		List<CustomerEntity> allcustomerdetails = new ArrayList();
		allcustomerdetails.add(new CustomerEntity(1, "Ajay", "KANIGIRI", "ajayjavadeveloper012@gmail.com"));
		allcustomerdetails.add(new CustomerEntity(1, "Balu", "NARASARAO PETA", "BALUjavadeveloper345@gmail.com"));
		allcustomerdetails.add(new CustomerEntity(1, "Uday kumar", "DODLERU", "udayjavadeveloper678@gmail.com"));
		allcustomerdetails.add(new CustomerEntity(1, "Nayeem", "PIDUGURALLA", "nayeemjavadeveloper901@gmail.com"));

		logger.info("saved the all customer details in DAO LAYER");
		return allcustomerdetails;
	}

}
