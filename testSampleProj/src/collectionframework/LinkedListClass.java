package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
	
	public static void main(String[] args) {
		
		List list = new LinkedList<>();
		list.add("Srikanth");
		list.add(12);
		list.add('d');
		list.add(23.45f);
		list.add("Test");
		
		
		List list1 = new LinkedList();
		list1.add("Srikanth");
		list1.add(12);
		list1.add('d');
		list1.add(23.45f);
		list1.add(23232322323l);
		list1.add(10);
		
		/*
		 * list.retainAll(list1); // a intersection b
		 * 
		 * list1.retainAll(list);
		 * 
		 * list.removeAll(list1);
		 */
		
		list.remove(0);
		list.remove(new Integer(10));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

			
		
		
	}

}
