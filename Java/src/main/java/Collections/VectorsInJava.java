package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorsInJava {
	
	public static void main(String[] args) {
		
		List<Integer> vector = new Vector<>();
		
		vector.add(10);
		
		vector.add(30);
		
		vector.add(20);
		
		Iterator<Integer> itr = vector.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
