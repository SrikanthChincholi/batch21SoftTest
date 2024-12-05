package oops;

public class StudentDetails2 {

	int st_id;
	String st_name;
	String st_branch;
	final String COLLEGE = "XYZ Engg College";

	public void st_Details(int st_id, String st_name, String st_branch) {
		this.st_id = st_id;
		this.st_name = st_name;
		this.st_branch = st_branch;
		System.out.println("Student Id : " + st_id);
		System.out.println("Student Name : " + st_name);
		System.out.println("Student Branch : " + st_branch);
		System.out.println("Student College : " + COLLEGE);
	}

	public void marks(int marks) {
		System.out.println(st_name + " got " + marks);
	}

	public static void main(String[] args) {
		StudentDetails2 st_det = new StudentDetails2();
		st_det.st_Details(123, "Srikanth", "ECE");
		st_det.marks(900);
		st_det.st_Details(456, "Chandu", "MEC");
		st_det.marks(950);
		st_det.st_Details(678, "Aaryan", "CSE");
		st_det.marks(970);

	}

}
