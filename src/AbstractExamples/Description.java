package AbstractExamples;

import java.util.Scanner;

public class Description extends BatchDetails {
	Scanner s = new Scanner(System.in);
	
	int batchno = s.nextInt();
	String name = s.nextLine();
	
	@Override
	public void batchnumber() {
		if (batchno <= 5) {
			System.out.println("Valid Batch");
			System.out.println("Enter the studentname:" );
			//String c= s.nextLine();
		}
		else
		{
			System.out.println("Invalid Batch");
		}
	}
	@Override
	public void students() {
		if(batchno<=5)
		{
			System.out.println("U r eligible for selenium training");	
		}
	}
	public static void main(String[] args) {
		Description a = new Description();
		
		a.batchnumber();
		a.students();
	}
}