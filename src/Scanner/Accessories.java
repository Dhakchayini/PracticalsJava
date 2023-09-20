package Scanner;

import java.util.Scanner;

public class Accessories {//scanner
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the product name:");
		String b= a.nextLine();
		System.out.println("Product name:"+ b);
		System.out.println("-------------------");
		System.out.println("Enter the Facepackname:");
		String c= a.nextLine();
		System.out.println("Fcae packname:"+c);
		System.out.println("--------------------");
		System.out.println("Enter the name:");
		char d=a.next().charAt(1);
		System.out.println("name:"+ d);
		System.out.println("-----------------------");
		System.out.println("Enter the value:");
		int e= a.nextInt();
		System.out.println("Value is:"+ e);
		System.out.println("-------------------------");
		System.out.println("Enter the float value:");
		float f= a.nextFloat();
		System.out.println("Value is:"+f);
		System.out.println("--------------------------");
		
		
	}

}
