package dataencapsulation;

public class EmployeeClass {

	private String ename;
	private int empid;
	private float hike;
	private String location;
	private String designation;
	private String shifttimings;
	
		
	private String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	private String getShifttimings() {
		return shifttimings;
	}

	public void setShifttimings(String shifttimings) {
		this.shifttimings = shifttimings;
	}

	private String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	private int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	private float getHike() {
		return hike;
	}

	public void setHike(float hike) {
		this.hike = hike;
	}

	public void displayEmpDetails() {
		System.out.println("Employee Name : " + getEname());
		System.out.println("Employee ID : " + getEmpid());
		System.out.println("Employee Hike : " + getHike());
		System.out.println("Employee Location : " + getLocation());
		System.out.println("Employee Designation : " + getDesignation());
		System.out.println("Employee Shift Timings : " + getShifttimings());
	}

}
