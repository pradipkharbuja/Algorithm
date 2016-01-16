package edu.mum.pradip.libs;

import java.util.Random;

public class RandomIntegerList {

	public static int[] generate(int n){
		
		int[] array = new int[n];
		
		Random random = new Random();
		
		for(int i = 0; i < n; i++){
			array[i] = random.nextInt(100);
		}
		
		return array;
		
	}
	
}
