package me.jatinsingh.test1;

public class StudentEnc extends Citizen {
	
	public StudentEnc(String adhaar, String name, String ID) {
		super(adhaar, name);
		this.ID=ID;
	}

	private String ID;
	private String number;
	private String address;
	
	public String getID() {
		return ID;
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
	
	@Override
	public String toString() {
		
		return super.toString() + "ID: " + ID + "\nNumber: " + number + "\nAddress: " + address;
	}
}

