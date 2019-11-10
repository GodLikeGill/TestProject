package me.jatinsingh.test7;

public class StudentGen <K> {
	
	String name;
	K totalmarks;
	
	public StudentGen(String name, K totalmarks) {
		super();
		this.name = name;
		this.totalmarks = totalmarks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public K getTotalmarks() {
		return totalmarks;
	}
	
	public void setTotalmarks(K totalmarks) {
		this.totalmarks = totalmarks;
	}
}
