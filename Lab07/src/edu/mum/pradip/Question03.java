package edu.mum.pradip;

import java.util.Arrays;

import edu.mum.pradip.libs.Utils;

public class Question03 {

	public static void main(String[] args) {
		int[] array = Utils.generateRandom(6);
		
		array = getNewArray(array);

		System.out.println(Arrays.toString(array));
	}

	public static int[] getNewArray(int[] array) {
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, array.length - 1);
		
		boolean small = true;
		int[] newArray = new int[array.length];

		int k = 0;
		int j = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			if (small) {
				newArray[i] = array[k++];
			} else {
				newArray[i] = array[j--];
			}
			small = !small;
		}
		return newArray;
	}
}
