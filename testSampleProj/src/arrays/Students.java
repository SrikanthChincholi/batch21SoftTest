package arrays;

public class Students {

	String sname;
	int sno;
	String branch;
	String college;

	public Students(String sname, int sno, String branch, String college) {
		this.sname = sname;
		this.sno = sno;
		this.branch = branch;
		this.college = college;
	}
	
	public void display() {
		System.out.println("Student Name : " + sname);
		System.out.println("Student No : " + sno);
		System.out.println("Student Branch : " + branch);
		System.out.println("Student College : " + college);
	}

}
