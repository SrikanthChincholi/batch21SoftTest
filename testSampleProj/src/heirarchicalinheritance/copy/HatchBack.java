package heirarchicalinheritance.copy;

public class HatchBack extends Car{
	
	public void getTypeofCar() {
		typeOfCar = "Hatchback";
		System.out.println("Type of Car  :" + typeOfCar);
	}

	public void getPrice()
	{
		price = "3.4L";
		System.out.println("Price : "+ price);
	}

	public static void main(String[] args) {
		HatchBack c = new HatchBack();
		c.getCarDetails();
		c.getTypeofCar();
		c.getPrice();
	}

}
