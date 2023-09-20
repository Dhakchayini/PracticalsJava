package com.java;

public class JavaClass {// class

	private void student_StudentName() {// Method
		// TODO Auto-generated method stub
		System.out.println("Mahati");

	}

	private void student_RollNo() {// Method
		System.out.println("7869");

	}

	private void student_Dob() {// Method
		// TODO Auto-generated method stub
		System.out.println("20-10-2014");
	}

	private void student_SchoolName() {// Method
		// TODO Auto-generated method stub
		System.out.println("SRMJV");

	}

	private void student_Class() {
		System.out.println("III");

	}

	public static void main(String[] args) {
		// classname refname = new classname();
		JavaClass x = new JavaClass();
		x.student_StudentName();
		x.student_Class();
		x.student_RollNo();
		x.student_Dob();
		x.student_SchoolName();
	}

}
