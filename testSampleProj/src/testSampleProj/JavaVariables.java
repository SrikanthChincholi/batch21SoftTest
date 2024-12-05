package testSampleProj;

public class JavaVariables {

	// instance variables - global variable
	String name = "Srikanth";
	int age;
	float salary = 45000.00f;
	String location = "Hyderabad";
	float bonus;

	public void getDetails() {
		float bonus = 5.0f;
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + (salary * bonus));
		System.out.println("Location :" + location);
	}
	
	public void getDetails1() {
		float bonus = 2.5f;
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + (salary * bonus));
		System.out.println("Location :" + location);
	}
	
	public static void main(String[] args) {
		JavaVariables jv = new JavaVariables();
		jv.getDetails();
		jv.getDetails1();
	}

}
