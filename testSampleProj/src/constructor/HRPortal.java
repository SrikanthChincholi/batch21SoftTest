package constructor;

public class HRPortal extends Employee {

	float sal;

	public HRPortal(String ename, int empid, float sal, float hike) {
		super(ename, empid);
		this.sal = sal;
		super.hike = hike;
	}

	public HRPortal() {
		this("Srikanth", 123, 345000f, 3.5f);
	}

	public static void main(String[] args) {
		HRPortal hr = new HRPortal();
		hr.displayEmpDetails();
	}

	public void displayEmpDetails() {
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee ID : " + empid);
		System.out.println("Employee Salary : " + sal);
		System.out.println("Employee Hike : " + hike);
	}

}


//this 
//super
//this()
//super()