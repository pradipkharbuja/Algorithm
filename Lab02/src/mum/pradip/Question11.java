package mum.pradip;

public class Question11 {

	public static int fibonacci(int n) {
		int a, b, c;
		a = 0;
		b = 1;

		for (int i = 1; i <= n; i++) {
			c = a;
			a = a + b;
			b = c;
		}

		return a;
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(0));
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(7));
	}

}
