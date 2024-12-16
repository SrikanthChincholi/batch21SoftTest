package laptops;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLaps implements Comparator<Laptops> {

	public static void main(String[] args) {

		List<Laptops> alllaps = LaptopDetails.getLaptops();
		Collections.sort(alllaps, new SortLaps());
		for (Laptops l : alllaps) {
			System.out.println(l.getModel() + l.getName() + l.getPrice());
		}

	}

	@Override
	public int compare(Laptops lap1, Laptops lap2) {
		if (lap1.price.compareTo(lap1.price) < 1) {
			return 1;
		} else {
			return -1;

		}
	}

}
