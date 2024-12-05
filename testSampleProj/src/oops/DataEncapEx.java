package oops;

public class DataEncapEx extends DataEncapsulationClass {
	public static void main(String[] args) {
		DataEncapEx e = new DataEncapEx();
		e.setS_no(12);
		e.setAddress("Hyderabad");
		e.setBranch("ECE");
		System.out.println(e.getS_no());
		System.out.println(e.getBranch());
		System.out.println(e.getAddress());
		System.out.println(e.college);
	}

}
