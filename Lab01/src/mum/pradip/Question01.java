package mum.pradip;

//GCD Problem

/*Problem 1. GCD Algorithm. Write a Java method int gcd(int m, int n) which accepts
positive integer inputs m, n and outputs the greatest common divisor of m and n.
*/

public class Question01 {

	public static int gcd(int m, int n) {
		if (m <= 0 || n <= 0) {
			throw new IllegalArgumentException("Input must be greater than 0!");
		}

		int rem;
		do {
			rem = m % n;

			if (rem == 0) {
				return n;
			}
			m = n;
			n = rem;
		} while (rem > 1);

		return n;
	}

	public static int gcdRecursive(int m, int n) {
		if (n == 0) {
			return m;
		}

		return gcdRecursive(n, m % n);
	}

	public static int computeGCD(int m, int n) {
		
		int smaller = m > n ? n: m;
		int gcd = 1;
		for (int i =2; i <= smaller; i ++){
			if ( m % i == 0 && n % i == 0){
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		System.out.println("GCD: " + gcd(96, 256));
		System.out.println("GCD: " + gcdRecursive(96, 256));
		System.out.println("GCD: " + computeGCD(96, 256));

		System.out.println("GCD: " + gcd(24, 17));
		System.out.println("GCD: " + gcdRecursive(24, 17));

		System.out.println("GCD: " + gcd(24, 12));
		System.out.println("GCD: " + gcdRecursive(24, 12));

		System.out.println("GCD: " + gcd(24, 8));
		System.out.println("GCD: " + gcdRecursive(24, 8));

		System.out.println("GCD: " + gcd(585, 7425));
		System.out.println("GCD: " + gcdRecursive(585, 7425));
	}

}
