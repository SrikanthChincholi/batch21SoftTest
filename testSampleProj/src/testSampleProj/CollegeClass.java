package testSampleProj;

public class CollegeClass {

	static String collegename = "Aurora College";
	String stname;
	long age = 23232232322232323l;
	String branchName;
	float sal = 23456.75454545445f;
	double sal1 = 34343433343423232.555445454545454545;
	
	
	
	

	public void getStudentDetails(String stname, int age, String branchName) {
		System.out.println("CollegeName : " + collegename);
		System.out.println("Student Name : " + stname);
		System.out.println("Student Age : " + age);
		System.out.println("Student Branch : " + branchName);
	}

	public static void main(String[] args) {

		CollegeClass cc = new CollegeClass();
		cc.getStudentDetails("Srikanth", 26, "CSE");
		System.out.println("**************************");
		cc.getStudentDetails("Chandu", 25, "ECE");
		System.out.println("**************************");
		cc.getStudentDetails("Aaryan", 22, "IT");
		
	
	}

}
