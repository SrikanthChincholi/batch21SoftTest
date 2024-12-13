package collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

	public static void main(String[] args) {

		Set set = new LinkedHashSet();

		set.add(1);
		set.add("Test");
		set.add('c');
		set.add(23.45f);
		set.add(true);
		set.add(1);
		set.add("Test");
		set.add('c');
		set.add(23.45f);
		set.add(true);

		System.out.println(set);

		java.util.Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
