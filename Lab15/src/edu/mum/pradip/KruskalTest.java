package edu.mum.pradip;

public class KruskalTest {

	public static void main(String[] args) {
		// int[][] list = {
		// {0, 0, 0, 0},
		// {1, 0, 0, 0},
		// {3, 3, 0, 0},
		// {1, 0, 2, 0}
		// };

		// Only lower triangle is calculated, so upper triangle data can be 0
		// int [][] data = { //expected MST: [{A, B, 1}, {C, D, 1}, {A, C, 2},
		// {D, E, 2}]
		// {0, 0, 0, 0, 0},
		// {1, 0, 0, 0, 0},
		// {2, 0, 0, 0, 0},
		// {0, 0, 1, 0, 0},
		// {4, 0, 3, 2, 0},
		// };

		int[][] data = { 
				// expected: [{C, D, 4}, {A, C, 9}, {E, F, 18}, {H, I, 19}, {G, I, 21}, {A, B, 22}, {E, G, 23}, {D, I, 30}]
				// Minimum Spanning Weight: 146

				{0, 22, 9, 12, 0, 0, 0, 0, 0},
				{22, 0, 35, 0, 0, 36, 0, 34, 0},
				{9, 35, 0, 4, 65, 42, 0, 0, 0},
				{12, 0, 4, 0, 33, 0, 0, 0, 30},
				{0, 0, 65, 33, 0, 18, 23, 0, 0},
				{0, 36, 42, 0, 18, 0, 39, 24, 0},
				{0, 0, 0, 0, 23, 39, 0, 25, 21},
				{0, 34, 0, 0, 0, 24, 25, 0, 19},
				{0, 0, 0, 30, 0, 0, 21, 19, 0}
		};

		Kruskal kruskal = new Kruskal(data);
		kruskal.perform();
		System.out.println(kruskal);
	}

}
