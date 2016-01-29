package edu.mum.pradip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

	public static void radixSort(int[] array, int radix) {

		List<Integer>[] bucket1 = new ArrayList[radix];
		List<Integer>[] bucket2 = new ArrayList[radix];

		for (int i = 0; i < array.length; i++) {
			bucket1[i] = new ArrayList<>();
			bucket2[i] = new ArrayList<>();
		}

		for (int i = 0; i < array.length; i++) {
			int remainder = array[i] % radix;
			bucket1[remainder].add(array[i]);
		}
		System.out.println(Arrays.toString(bucket1));
		
		for (int i = 0; i < array.length; i++) {
			for (int temp : bucket1[i]) {
				int quoitent = temp / radix;
				bucket2[quoitent].add(temp);
			}
		}
		System.out.println(Arrays.toString(bucket2));
		
		int k = 0;		
		for(int i = 0; i < array.length;i++){
			for (int temp : bucket2[i]) {
				array[k++] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 80, 27, 72, 1, 27, 8, 64, 34, 16 };
		int radix = 9;
		radixSort(array, radix);
		System.out.println(Arrays.toString(array));
	}

}
