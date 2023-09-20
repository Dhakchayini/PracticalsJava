package com.java;

public class College2 extends College1 {// Child class 2
	// Multi Level Inheritance - Child Class 2
	private void staff() {
		System.out.println("Staff = Kiran");

	}

	public static void main(String[] args) {
		College2 a = new College2();
		a.principal();
		a.hod();
		a.staff();
	}
}
