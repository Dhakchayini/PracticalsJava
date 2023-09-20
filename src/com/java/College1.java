package com.java;

public class College1 extends College {// child Class
	// Multi level Inheritance - Child 1
	public void hod() {
		System.out.println("HOD = Purushothaman");

	}

	public static void main(String[] args) {
		College1 a = new College1();
		a.hod();
		a.principal();

	}
}
