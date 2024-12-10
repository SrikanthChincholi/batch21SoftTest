package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srikanth");
		list.add(12);
		list.add('d');
		list.add(23.45f);
		list.add(23232322323l);
		list.add(10);
		int a = 10;
		list.add(a);

		// meth1(list);
		// meth2(list);
		// meth3(list);
		// meth4(list);
		// meth5(list);
		reverse(list);

	}

	public static void meth1(List list) {

		for (Object obj : list) {
			System.out.println(obj);
		}

	}

	public static void meth2(List list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static void meth3(List list) {

		System.out.println(list);

	}

	public static void meth4(List list) {

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void meth5(List list) {

		ListIterator litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

	public static void reverse(List list) {
		Collections.reverse(list);
		System.out.println(list);
		Collections.swap(list,2,6);
		System.out.println(list);
	}

}
