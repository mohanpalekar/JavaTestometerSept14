package javaPractice;

public class Method2 {

	public void sumOf2Numbers(int x, int y) {
		System.out.println(x+y);
	}

	public int sumOf2Number(int x, int y) {
		return x+y;
	}

	public int [] getTable(int a) {

		int [] ar = new int [10];

		for(int i=1; i<11;i++) {
			ar[i-1] = a*i;
		}

		return ar;
	}

	public int[] writeTable(int a) {

		int [] arr = new int [10];

		for(int i=1; i<11; i++) {

			arr[i-1] = a*i;

			System.out.print(arr[i-1]+" , ");
		}

		return arr;

	}

	public void checkIfPresent(String str, String check) {

		//String str = "My Name is XYZ";
		//String check = "Name"

		if(str.contains(check)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}


	public String convertStringToLowercase(String str) {
		return str.toLowerCase();
	}
	
	public String convertStringToUpperCase(String str) {
		return str.toUpperCase();
	}


}
