package javaPractice;

import java.util.Arrays;

public class Student {

	private int rollNo;

	private String className;

	private String [] subjects;

	public Student(int rollNo, String className, String[] subjects) {
		super();
		this.rollNo = rollNo;
		this.className = className;
		this.subjects = subjects;
	}
	
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", className=" + className + ", subjects=" + Arrays.toString(subjects)
		+ "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}



}
