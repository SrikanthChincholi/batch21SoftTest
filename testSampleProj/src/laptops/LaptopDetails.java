package laptops;

import java.util.ArrayList;
import java.util.List;

public class LaptopDetails {
	static List<Laptops> laps;

	public static List<Laptops> getLaptops() {
		laps = new ArrayList<>();
		laps.add(new Laptops("Dell", "2021", "54000"));
		laps.add(new Laptops("HP", "2020", "75000"));
		laps.add(new Laptops("Lenovo", "1990", "64000"));
		return laps;
	}

	

}
