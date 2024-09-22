package javaPractice;

public class q3 {

	public static void main(String[] args) {


		int x=6;
		int y =8;

		int g = 3;
		int h = 8;

		addNumbers(x, y);
		addNumbers(g, h);

		sumOfNumbers(x, y);
		sumOfNumbers(g, h);
	}

	public static int addNumbers(int a, int b){

		int c = a+b;
		System.out.println("sum is " +c);
		return c;


	}

	public static void sumOfNumbers(int p, int q){	

		System.out.println(p+q);



	}

}
