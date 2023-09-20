package Condition;

import java.util.Scanner;

public class IfScanner {

	Scanner a = new Scanner(System.in);
	int i = a.nextInt();

	public void rupees() {
		if (i > 40 && i <= 60) {
			System.out.println("You marked as Second Class");
		} else if (i >= 60 && i <= 100) {
			System.out.println("You marked as Distinct Class");
		}else if(i>=100) {
			System.out.println("You are Disqualified");
		}
		else {
			System.out.println("You are Failed");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the Score:");
		IfScanner a = new IfScanner();
		a.rupees();
	}
}
