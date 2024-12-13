package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortingElements {

	public static void main(String[] args) {

		Object[] str = { "USA", "NZL", "BRAZIL", "CAN", "IND", "UK", "AUS" };

		Set set = new TreeSet();
		for (int i = 0; i < str.length; i++)
			set.add(str[i]);
		System.out.println(set);
		str = set.toArray();
		System.out.println(Arrays.toString(str));
		ArrayList a = new ArrayList<>(set);
		Collections.reverse(a);
		System.out.println(a);
	
	}

}
