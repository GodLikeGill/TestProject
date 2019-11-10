package me.jatinsingh.test1;

public class Student {
	
	private String name;
	private String ID;
	private String number;
	private String address;
	private String totalmarks;
	
	public String getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		
		return "Name: " + name + "\nID: " + ID + "\nNumber: " + number + "\nAddress: " + address;
	}
}

