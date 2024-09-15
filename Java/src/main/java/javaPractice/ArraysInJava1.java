package javaPractice;

public class ArraysInJava1 {

	public static void main(String[] args) {

		String [] fruits = new String [6];

		//int [] arr = new int [10];

		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Orange";
		fruits[3] = "Guava";
		fruits[4] = "Grapes";
		
		
		for(String s : fruits) {
			System.out.println(s);
		}
		
		int [] arr = new int [10];
		
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 54;
		arr[3] = 76;
		arr[4] = 101;
		arr[5] = 163;
		arr[6] = 11;
		arr[7] = 10;
		arr[8] = 1;
		arr[9] = 1;
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		char [] ch = new char[3];
		
		ch[0] = 'd';
		ch[1] = 't';
		ch[2] = 'u';
		
		for(char c : ch) {
			System.out.println(c);
		}


	}

}
