package sort;

import java.util.Arrays;

public class MergeSortPlus {

	//public static int[] array;

	public static int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int j;
			for (j = i; j > 0 && value < array[j - 1]; j--) {
				array[j] = array[j - 1];
			}
			array[j] = value;
		}
		return array;
	}

	public static int[] mergeSort(int[] array, int startIndex, int endIndex) {

		if (startIndex < endIndex) {
			int midIndex = (startIndex + endIndex) / 2;

			mergeSort(array, startIndex, midIndex);
			 mergeSort(array, midIndex + 1, endIndex);

			mergeTheArray(array, startIndex, midIndex, endIndex);
		}

		return array;
	}

	public static int[] mergeTheArray(int[] array, int startIndex, int midIndex, int endIndex) {
		int[] newArray = new int[endIndex +1];

		int[] tempFirstArray = Arrays.copyOfRange(array, startIndex, midIndex + 1);
		int[] tempSecondArray = Arrays.copyOfRange(array, midIndex + 1, endIndex+ 1);

		int x = 0, y = 0, i = 0;
		while (x < tempFirstArray.length && y < tempSecondArray.length) {
			if (tempFirstArray[x] < tempSecondArray[y]) {
				newArray[i++] = tempFirstArray[x++];
			} else {
				newArray[i++] = tempSecondArray[y++];
			}
		}

		while (x < tempFirstArray.length) {
			System.out.println ( "End Index " + endIndex + "  " + tempFirstArray[x]);
			newArray[i++] = tempFirstArray[x++];
		}

		while (y < tempSecondArray.length) {
			newArray[i++] = tempSecondArray[y++];
		}
	
		//System.out.println("Array: " + Arrays.toString(tempFirstArray) + " " + Arrays.toString(tempSecondArray));
		
		//System.out.println("Sorted Small Array: " + Arrays.toString(newArray));

		return newArray;
	}

	public static int[] mergeSortPlus(int[] array) {
		if (array.length < 6) {
			System.out.println("Doing Insertion Sort...");
			return insertionSort(array);
		} else {
			System.out.println("Doing Merge Sort...");
			return mergeSort(array, 0, array.length);
		}
	}

	public static void main(String[] args) {
		// int array[] = { 3, 1, 5, 7 };
		int[] array = { 6, 4, 5, 3, 2, 4 };
		
		System.out.println("Before Sorting: " + Arrays.toString(array));
		System.out.println("After Sorting: " + Arrays.toString(mergeSortPlus(array)));
	}

}
