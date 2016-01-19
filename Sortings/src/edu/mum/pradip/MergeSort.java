package edu.mum.pradip;

import java.util.Arrays;

import edu.mum.pradip.libs.Utils;

public class MergeSort {

	private int[] array;
	private int[] temp;

	public MergeSort(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public void merge(int lower, int mid, int upper) {
		temp = Arrays.copyOf(array, array.length);

		int i = lower, j = mid, k = lower;
		while (i < mid && j < upper) {
			if (temp[i] <= temp[j]) {
				array[k++] = temp[i++];
			} else {
				array[k++] = temp[j++];
			}
		}

		while (i < mid) {
			array[k++] = temp[i++];
		}
		

		//array = Arrays.copyOf(temp, temp.length);
		//array[0] = 1000;
	}

	public void doSort(int lower, int upper) {

		if (lower == upper) {
			return;
		}

		int mid = (lower + upper) / 2;

		doSort(lower, mid);
		doSort(mid + 1, upper);

		merge(lower, mid, upper);

		System.out.println("" + lower + " " + mid + " " + upper + "  " + Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 4, 9, 2 };
		Utils.generateRandom(4);

		MergeSort mergeSort = new MergeSort(array);
		System.out.println("Before: " + mergeSort);
		mergeSort.doSort(0, array.length);
		System.out.println("After: " + mergeSort);

	}
}
