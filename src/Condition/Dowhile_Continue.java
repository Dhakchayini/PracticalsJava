package Condition;

import java.util.Scanner;

public class Dowhile_Continue {
	
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= a.nextInt();
		System.out.println("***********");
		
		int i =1;
		do
		{
			System.out.println(i);
			if(i==16)
			{
				break;
			}else
			{
			i=i+2;
			}
		}while(i<=n);
		
	}

}
