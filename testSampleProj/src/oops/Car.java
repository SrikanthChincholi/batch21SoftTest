package oops;

public class Car extends Vehicle{

	public static void main(String[] args) {
		
		Car c = new Car();
		c.make = "2022";
		c.model = "Verna";
		c.manf = "Hyundai";
		System.out.println(c.make);
		System.out.println(c.model);
		System.out.println(c.manf);
	}
}
