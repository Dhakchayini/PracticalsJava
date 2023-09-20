package Polymorphism;

public class OverLoading {
	public void student(String name) { // Data type
		// TODO Auto-generated method stub
		// Method Overloading

		System.out.println("Student Name: " + name);
	}

	private void student(long mobileno, String fathername) {// Data Count
		// TODO Auto-generated method stub
		System.out.println("Student Contact:" + mobileno);
		System.out.println("Student Father name:" + fathername);
	}

private void student(int age, int standrd, int roll_no, String mothername ) {//Data Order
	// TODO Auto-generated method stub
System.out.println("Student age:"+ age );
System.out.println("Student Class: "+ standrd);
System.out.println("Student roll_no:"+ roll_no );
System.out.println("Student Mother name:"+ mothername);

}

	public static void main(String[] args) {
		OverLoading a = new OverLoading();
		a.student("Maha");
		a.student(9876543210L, "Swathy");
		a.student(45, 3, 4586, "Puru");

	}
}
