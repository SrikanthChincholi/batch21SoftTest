package oops;

public class DogClass {

	String color;
	String name;
	String breed;

	public void eating() {
		System.out.println(" Eating........");
	}

	public void barking() {
		System.out.println(" Barking........");
	}

	public static void main(String[] args) {

		DogClass dc = new DogClass();
		DogClass dc1 = new DogClass();
		DogClass dc2 = new DogClass();
		DogClass dc3 = new DogClass();
		DogClass dc4 = new DogClass();
		
		dc.breed = "Lab";
		dc.name = "Lucky";
		dc.color = "White";

		System.out.println(dc.breed);
		System.out.println(dc.name);
		System.out.println(dc.color);
		dc.barking();
		dc.eating();

	}
}
