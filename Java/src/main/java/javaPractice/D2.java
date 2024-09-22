package javaPractice;

public class D2 {

	public static void main(String[] args) {
		//int[] arr = {1, 6, 7, 8, 5, 4, 2, 7, 1, 9, 3, 45};

		long startTime = System.currentTimeMillis();
		int[] arr = {-96, -12, -8, -1, 0, 1, 2, 3, 5, 6, 7, 8, 12, 24, 33, 54, 96, 103};
		int sum = 7;

		int n = arr.length;



		for (int i = 0; i < n; i++) {


			for (int j = i + 1; j < n; j++) {

				if (arr[i] + arr[j] == sum) {
					System.out.println("pair is {" +arr[i] +","+arr[j] + "}" );

				}
			}

		}

		long endTime = System.currentTimeMillis();

		System.out.println(endTime-startTime);



	}
}
