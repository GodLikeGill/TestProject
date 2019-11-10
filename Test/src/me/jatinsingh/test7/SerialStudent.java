package me.jatinsingh.test7;

import java.io.Serializable;

public class SerialStudent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	String address;
	
	public SerialStudent(String name , String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address;
	}
}
