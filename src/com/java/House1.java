package com.java;

public class House1 extends Assets {// child class
	public void child1() {
		System.out.println("first half");

	}

	public static void main(String[] args) {
		House1 a = new House1();
		a.house();
		a.child1();
	}

}
