package Casting;

public class Casting {// Casting

	// Widening Typecasting

	public static void main(String[] args) {

		short a = (short) 12645;
		int b = a;
		System.out.println(b);
		System.out.println("*************");

		byte c = (byte) 116;
		float d = c;
		System.out.println(d);
		System.out.println("************");

		// narrowing typecasting

		// datatype refname= (datatype) variablename;

		float e = 12.3456f;
		int f = (int) e;
		System.out.println(f);
		System.out.println("----------------------");

		double g = 15645.25689;
		short h = (short) g;
		System.out.println(h);
		System.out.println("-----------------------");
		
		short i = (short) 12598;
		byte j =(byte)i;
		System.out.println(j);
		System.out.println("-----------------------");

	}

}
