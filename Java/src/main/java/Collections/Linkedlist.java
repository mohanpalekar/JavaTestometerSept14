package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("Pune");
		list.add("Mumbai");
		list.add("Thane");

		list.add(1, "Nagpur");
		//
		
		
		int index = list.indexOf("Mumbai");
		
		//System.out.println(index);
		list.add(index, "Gujrat");
		list.remove("Mumbai");

		//		list.removeFirst();
		//		list.removeLast();

		//System.out.println(list);

		//		for(String str : list) {
		//			System.out.println(str);	
		//		}

		Iterator<String> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}




	}

}
