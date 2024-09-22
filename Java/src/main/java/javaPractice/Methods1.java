package javaPractice;

public class Methods1 {

	public static void main(String[] args) {


		sumOf2Numbers(54,76);
		sumOf2Numbers(3,0);

		int [] arr = {-9,4,2,16,7,9,3,1,1,3,5,6,9,-15,9,7,5,86};

		Q1.getPairsOf7(arr);

		printTable(4);

		printTable(5);

		getTable(9);

		Q1.getPairsOf7(getTable(9));



	}

	public static void sumOf2Numbers(int a, int b) {
		System.out.println(a+b);
	}


	public static void printTable(int a) {

		for(int i=1; i<11; i++) {
			System.out.print(a*i+",");
		}
		System.out.println();

	}

	public static int [] getTable(int a) {

		int [] ar = new int [10];

		for(int i=1; i<11;i++) {
			ar[i-1] = a*i;
		}

		return ar;
	}

}
