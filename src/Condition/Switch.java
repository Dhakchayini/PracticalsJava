package Condition;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner a= new Scanner(System.in);
				System.out.println("Press the option for your language");
				int n= a.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Tamil");
						break;
					case 2:
						System.out.println("English");
						break;
					case 3:
						System.out.println("Hindi");
						break;
						default:
							System.out.println("U entered the wrong option");
							
						
				}
	}

}
