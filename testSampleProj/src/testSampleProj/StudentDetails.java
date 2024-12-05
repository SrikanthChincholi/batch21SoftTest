package testSampleProj;

public class StudentDetails {

	String name = "Srikanth";
	int st_roll = 234;
	float grade = 9.8f;
	byte section = 3;
	Object obj;

	public void getStudentDetails() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Roll No : " + st_roll);
		System.out.println("Student Grade : " + grade);
		System.out.println("Student Section: " + section);
	}

	public static void main(String arg[]) {
		StudentDetails sd = new StudentDetails();
		sd.getStudentDetails();
	}

}

// Java is OOPs - Object Oriented Programming 