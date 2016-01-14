package mum.pradip;

public class Question13 {

	public static void countZeroOne(int[] array) {
		int count0, count1;
		count0 = 0;
		count1 = 0;

		// Checking number of loops
		int numOfLoops = 0;

		// Maintaining the algorithm o(n)
		if (array[array.length - 1] == 0) {
			count0 = array.length;
		} else {

			for (int i = 0; i < array.length; i++) {
				numOfLoops++;
				if (array[i] == 0) {
					count0++;
				} else {
					break;
				}
			}
		}

		count1 = array.length - count0;
		System.out.println("No. of Loops: " + numOfLoops);
		System.out.println("No. of Zeros: " + count0);
		System.out.println("No. of Ones: " + count1);
		System.out.println();
	}

	public static void main(String[] args) {
		countZeroOne(new int[] { 0, 0, 1, 1, 1, 1, 1 });
		countZeroOne(new int[] { 0, 0, 0, 1, 1 });
		countZeroOne(new int[] { 0, 0, 0, 0 });
		countZeroOne(new int[] { 1, 1, 1, 1, 1 });
	}

}
