package singleinheritance;

public class Bike extends Vehicle {

	public void getBikeDetails() {
		model = 2022;
		make = "Hero";
		design = "Champ";
		price = "56k";
		System.out.println("Model :" + model);
		System.out.println("Make : " + make);
		System.out.println("Design : " + design);
		System.out.println("Price : " + price);
	}
	

	public static void main(String[] args) {
		Bike b = new Bike();
		b.getBikeDetails();
	}

}
