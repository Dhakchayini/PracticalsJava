package com.java;

public class child extends parent {
//single inheritance - child class
	private void book1() {
		System.out.println("Literarure");
	}

	public static void main(String[] args) {
		child a = new child();
		a.book();
		a.book1();
	}
}
