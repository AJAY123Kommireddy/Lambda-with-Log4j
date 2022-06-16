package com.java8.entity;

public class CustomerEntity {

	private int id;
	private String name;
	private String location;
	private String gmail;
	
	

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(int id, String name, String location, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.gmail = gmail;
	}

	@Override
	public String toString() {
		return "CustomerEnity [id=" + id + ", name=" + name + ", location=" + location + ", gmail=" + gmail + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

}
