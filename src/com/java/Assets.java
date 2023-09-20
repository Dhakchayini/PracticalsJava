package com.java;

public class Assets {// parent class
	// hierarcial inheritance - parent
	public void house() {
		System.out.println("Swathy's House");
	}

	public static void main(String[] args) {
		Assets a = new Assets();
		a.house();
	}
}
