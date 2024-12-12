package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListClass1 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();
		l.add("Test");
		l.add(10);
		l.add('c');
		l.addFirst("Test1");
		l.addLast("Last");
		l.add(5);
		l.add(6, "Six");
		
	
		/*
		 * System.out.println(l.element()); System.out.println(l.offer(10));
		 * System.out.println(l.peek()); System.out.println(l.poll());
		 * System.out.println(l.pop()); System.out.println(l);
		 */

		ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("***********");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());

		}

	}

}
