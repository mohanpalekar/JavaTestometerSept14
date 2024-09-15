package javaPractice;

public class ArraysInJava2 {
	
	public static void main(String[] args) {
		
		String [] str = {"Mango", "Apple", "Guava", "Kiwi", "Pineapple"};
		
		for(String s : str) {
			System.out.print(s+", ");
		}
		
		System.out.println();
		
		int [] arr = {54,56,23,96,12,767,986,346};
		
		for(int i : arr) {
			System.out.print(i+", ");
		}
	}

}
