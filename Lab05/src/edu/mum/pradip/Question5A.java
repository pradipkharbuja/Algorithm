package edu.mum.pradip;

public class Question5A {

	public static boolean selfAwareArray(int[] array) {

		for(int i = 0; i < array.length; i++){
			int count = 0;
			for(int j = 0; j < array.length; j++){
				if(array[j] == i) {
					System.out.println("i = " + i + "  array[j] = " + array[j] );
					count++;
				}
			}
			if(count != array[i]){
				System.out.println("i = " + i + "  array[i] = " + array[i] + "  Count = " + count);
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 1, 0, 0, 0};
		System.out.println("Self Aware Array: " + selfAwareArray(a));
	}

}
