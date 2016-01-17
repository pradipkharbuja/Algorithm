package edu.mum.edu;

public class Fibonacci {

	private static long[] list;

	public static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		list = new long[n + 1];
		list[0] = 1;
		list[1] = 1;

		return memorizedFibonacci(n);
	}

	public static long memorizedFibonacci(int n) {
		if (list[n - 1] == 0) {
			list[n - 1] = memorizedFibonacci(n - 1);
		}
		list[n] = list[n - 1] + list[n - 2];
		return list[n];
	}

	public static long fibonacciNormal(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return fibonacciNormal(n - 1) + fibonacciNormal(n - 2);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Memorized Recursion: " + fibonacci(40));
		System.out.println("Memorized Recursion Time: " + (System.currentTimeMillis() - start));

		long start2 = System.currentTimeMillis();
		System.out.println("Normal Recursion: " + fibonacciNormal(40));
		System.out.println("Normal Recursion Time: " + (System.currentTimeMillis() - start2));
	}

}
