package StringFunction;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//Scanner dd = new Scanner(System.in);
		//System.out.println("Enter the word");
		String a ="Malayalam";
		String Reverse = "" ;
		for(int i=a.length()-1;i>=0;i-- )
		{
			Reverse= Reverse + a.charAt(i);
		}
		System.out.println("Reversed word is "+Reverse);
		
		if( Reverse.equalsIgnoreCase(a))
		{
			System.out.println("Word is palindrome");
		}
		
		else
			System.out.println("Word is not a palindrome");
	}

}
