package me.jatinsingh.test1;

public abstract class Citizen {
	
	public Citizen(String adhaar, String name) {
		this.adhaar = adhaar;
		this.name = name;
	}
	
	String adhaar;
	String passportno;
	String name;
	
	public String getPassportno() {
		return passportno;
	}
	
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}
	
	public String getAdhaar() {
		return adhaar;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "\nAdhaar No. : " + adhaar + "\nPassport No. : " + passportno + "\nName : " + name + "\n";
	}
}
