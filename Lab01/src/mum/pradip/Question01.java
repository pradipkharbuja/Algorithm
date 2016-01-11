package mum.pradip;

//GCD Problem

public class Question01 {

	// Assumes m is always greater than n
	public static void gcd(int m, int n) {
		long startTime, endTime;

		startTime = System.nanoTime();
		System.out.println("GCD: " + euclidean(m, n));
		endTime = System.nanoTime();

		System.out.println("Euclidean GCD Time: " + (endTime - startTime));
	}

	public static int euclidean(int m, int n) {
		int small = (m < n) ? m : n;
		int big = (m >= n) ? m : n;

		while(small != 0){
			
		}
		
		return small;
	}

	public static void main(String[] args) {
		gcd(24, 8);
	}

}
