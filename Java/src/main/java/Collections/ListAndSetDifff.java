package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListAndSetDifff {
	
	public static void main(String[] args) {
		
		List<String> set = new ArrayList<>();
		
		set.add("Guava");
		set.add("Apple");
		set.add("Pineapple");
		set.add("Guava1");
		set.add("Apple1");
		set.add(null);
		set.add("Pineapple1");
		set.add("Guava2");
		set.add("Apple2");
		set.add("Pineapple2");
		set.add("Pineapple2");
		set.add("Pineapple2");
		
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}

}
