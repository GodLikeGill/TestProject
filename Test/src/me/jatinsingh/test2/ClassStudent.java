package me.jatinsingh.test2;

public class ClassStudent {
	
		
	int rn;
	String name;
	String clg;
	
	ClassStudent(int rn, String name, String clg)  {
		this.rn=rn;
		this.name = name;
		this.clg = clg;
	}

	public String getName() {
		return name;
	}

	public String getClg() {
		return clg;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}
}