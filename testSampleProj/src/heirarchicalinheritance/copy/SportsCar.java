package heirarchicalinheritance.copy;

public class SportsCar extends Sedan{

	public void getTypeofCar() {
		typeOfCar = "SportCar";
		System.out.println("Type of Car  :" + typeOfCar);
	}

	public void getPrice()
	{
		price = "15.4L";
		System.out.println("Price : "+ price);
	}
	
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.getTypeofCar();
		c.getPrice();
	}
}
