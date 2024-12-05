package multilevelinheritance;

public class Sedan extends Car {

	public void getTypeofCar() {
		typeOfCar = "Sedan";
		System.out.println("Type of Car  :" + typeOfCar);
	}

	public void getPrice()
	{
		price = "5.4L";
		System.out.println("Price : "+ price);
	}

	public static void main(String[] args) {
		Sedan c = new Sedan();
		c.getCarDetails();
		c.getTypeofCar();
		c.getPrice();
	}

}
