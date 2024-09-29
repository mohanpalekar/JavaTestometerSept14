package Collections;

import java.util.List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Orange");
		list.add("Guava");
		list.add("Apple");
		
		

		System.out.println(list);

		//		list.remove(1);
		//		list.remove("Apple");		


		System.out.println(list);

		for(String str : list) {
			System.out.println(str);
		}

		if(list.contains("Apple")) {
			System.out.println("Yes");	
		}
		
		list.add("Mango");
		
		System.out.println(list);


	}

}
