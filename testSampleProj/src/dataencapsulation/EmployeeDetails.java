package dataencapsulation;

public class EmployeeDetails{

	public static void main(String[] args) {
		EmployeeClass ed = new EmployeeClass();

		ed.setEmpid(123);
		ed.setEname("Srikanth");
		ed.setHike(5.4f);
		ed.setLocation("Hyderabad");
		ed.setDesignation("QA");
		ed.setShifttimings("Regular");
		ed.displayEmpDetails();

		ed.setEmpid(345);
		ed.setEname("Chandu");
		ed.setHike(6.0f);
		ed.setLocation("Secundrabad");
		ed.setDesignation("QA Lead");
		ed.setShifttimings("Night");
		ed.displayEmpDetails();
	}

}
