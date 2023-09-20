package Constructor;

public class Student_Details {// Constructor

	public Student_Details() { // Default Constructor
		this("Mithun");
		System.out.println("Bio_Data");
	}

	public Student_Details(String studentName) { // Parameterised Constructor
		this("Purush",98976504321l);
		System.out.println("StudentName:" + studentName);

	}

	public Student_Details(String fatherName, long contactno) { // Paramerised Constructor
		this((short)05,7894,(short)4);
		
		System.out.println("Father Name:" + fatherName);
		System.out.println("Contact no:" + contactno);

	}

	public Student_Details(short age, int rollno, short std) { // Paramerised Constructor
		System.out.println("Student Age:" + age);
		System.out.println("Roll no:" + rollno);
		System.out.println("Student Standard:" + std);

	}

	public static void main(String[] args) {
		Student_Details a= new Student_Details();
	
		}
	
}
