package StringFunction;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String[] args) {
		
		Scanner dd = new Scanner(System.in);
		System.out.println("Enter the word");
		String a = dd.nextLine();
		String Reverse = "" ;
		String[] b = a.split(" ");
	   	    
	    for(int i= a.length()-1;i>=0;i-- )
		{
			Reverse= Reverse + a.charAt(i);
		}
		System.out.println("Reversed word is "+Reverse);
	    
	
	
	}

}
