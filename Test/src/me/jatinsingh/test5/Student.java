package me.jatinsingh.test5;

public class Student implements Comparable<Student> {
	
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		super();
		this.name=name;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Name: " + name + "  Marks: " + marks + "\n";
	}
	@Override
	public int compareTo(Student o) {
		
		return o.marks - o.getMarks();
	}
}
