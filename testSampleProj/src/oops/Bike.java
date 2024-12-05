package oops;

public class Bike extends Vehicle{
	
	String design;

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.make = "2022";
		b.model = "YBX";
		b.manf = "Yamaha";
		System.out.println(b.make);
		System.out.println(b.model);
		System.out.println(b.manf);
		
			
	}
}
class designClass extends Bike
{
public static void main(String[] args) {
		
	designClass b = new designClass();
		b.make = "2023";
		b.model = "ZX";
		b.manf = "Suzuki";
		b.design = "Fancy";
		System.out.println(b.make);
		System.out.println(b.model);
		System.out.println(b.manf);
		System.out.println(b.design);
		
	}
}
