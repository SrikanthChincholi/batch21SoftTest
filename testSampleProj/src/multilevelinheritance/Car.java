package multilevelinheritance;

import singleinheritance.Vehicle;

public class Car extends Vehicle {
	
	String typeOfCar;

	public void getCarDetails() {
		model = 2022;
		make = "Tata";
		design = "Tiago";
		System.out.println("Model :" + model);
		System.out.println("Make : " + make);
		System.out.println("Design : " + design);
		
	}
	

	public static void main(String[] args) {
		Car c = new Car();
		c.getCarDetails();
	}

}
