package com.java;

public class House2 extends Assets {// child class 2
	// hierarchial inheritance - child class 2
	public void child2() {
		System.out.println("Second Half");

	}

	public static void main(String[] args) {
		House2 a = new House2();
		a.house();
		a.child2();

	}
}
