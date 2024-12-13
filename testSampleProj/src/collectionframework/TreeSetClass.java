package collectionframework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		Set set = new TreeSet();

		set.add(1);
		set.add(20);
		set.add(3);
		set.add(21);
		set.add(19);
		set.add(4);
		set.add(5);
		
		set.add(1);
		set.add(20);
		set.add(3);
		set.add(21);
		set.add(19);
		set.add(4);
		set.add(5);

		System.out.println(set);

		java.util.Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
