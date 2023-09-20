package Condition;

import java.util.Scanner;

public class IfScan {
	
	public void condit() 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = a.nextLine();
		System.out.println("Enter the Age:");
		int age = a.nextInt();
		if(age<18)
		{
			System.out.println("Consult Comes under child");
			}
		else if(age>18 && age<60)
		{
			System.out.println("Consult comes under Adult");
		}
		else
		{
			System.out.println("Consult comes under Senior");
		}
	}

	public static void main(String[] args) {
		IfScan b = new IfScan();
		b.condit();
		IfScan c= new IfScan();
		c.condit();		
		IfScan d= new IfScan();
		d.condit();
		}
}
