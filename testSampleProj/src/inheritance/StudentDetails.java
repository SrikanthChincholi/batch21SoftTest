package inheritance;

public class StudentDetails {

	String st_name;
	String st_id;
	Address addrs;

	public StudentDetails(String st_name, String st_id, Address addrs) {
		this.addrs = addrs;
		this.st_name = st_name;
		this.st_id = st_id;
	}

	public static void main(String[] args) {
		StudentDetails st = new StudentDetails("Srikanth", "123",new Address("SRnagar", "SRnagar", "Hyderabad"));
		st.getStudentDetails();
	}

	public void getStudentDetails() {
		System.out.println(st_name);
		System.out.println(st_id);
		System.out.println(addrs.cur_add);
		System.out.println(addrs.per_add);
		System.out.println(addrs.location);
	}

}
