package oops;

public class StudentDetails {

	int st_id;
	String st_name;
	String st_branch;
	final String COLLEGE = "XYZ Engg College";
	StudentDetails()
	{
		
	}

	StudentDetails(int st_id, String st_name, String st_branch) {
		this.st_id = st_id;
		this.st_name = st_name;
		this.st_branch = st_branch;
	}

	public void st_Details() {
		System.out.println("Student Id : " + st_id);
		System.out.println("Student Name : " + st_name);
		System.out.println("Student Branch : " + st_branch);
		System.out.println("Student College : " + COLLEGE);
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		StudentDetails st_det = new StudentDetails(123, "Srikanth", "ECE");
		StudentDetails st = StudentDetails.class.newInstance();
		StudentDetails st_det1 = new StudentDetails(345, "Srikanth I", "CSE");
		StudentDetails st_det2 = new StudentDetails(567, "Srikanth II ", "MEC");
		
		st_det.st_Details();
		st_det1.st_Details();
		st_det2.st_Details();
	}

}
