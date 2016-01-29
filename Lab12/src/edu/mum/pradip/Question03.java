package edu.mum.pradip;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//3. Create a Java program to find all components of a graph given the adjacency matrix through BFS

public class Question03 {

	// private static int[][] array = {
	// { 0, 1, 1, 0, 0, 0 },
	// { 1, 0, 1, 0, 0, 0 },
	// { 1, 1, 0, 0, 0, 0 },
	// { 0, 0, 0, 0, 1, 1 },
	// { 0, 0, 0, 1, 0, 0 },
	// { 0, 0, 0, 1, 0, 0 },
	// };

//	 private static int[][] array = {
//	 {0,1,1,0,0,1,0,0,0},
//	 {1,0,0,0,0,0,0,0,0},
//	 {1,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,1,0,1,0,0},
//	 {0,0,0,1,0,0,1,0,0},
//	 {1,0,0,0,0,0,0,0,0},
//	 {0,0,0,1,1,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,1},
//	 {0,0,0,0,0,0,0,1,0}
//	 };

	// private static int[][] array = {
	// {0,0,0,0,0},
	// {0,0,1,1,1},
	// {0,1,0,1,1},
	// {0,1,1,0,1},
	// {0,1,1,1,0}
	// };

	// private static int[][] array = {
	// {0,1,1,0,0},
	// {1,0,0,1,0},
	// {1,0,0,0,1},
	// {0,1,0,0,0},
	// {0,0,1,0,0}
	// };

	 private static int[][] array = {
			 {0,1,1,0,0,1,0,0,0},
			 {1,0,0,0,0,1,0,0,0},
			 {1,0,0,0,0,1,1,0,0},
			 {0,0,0,0,1,0,0,0,1},
			 {0,0,0,1,0,0,0,0,1},
			 {1,1,1,0,0,0,0,1,0},
			 {0,0,1,0,0,0,0,1,0},
			 {0,0,0,0,0,1,1,0,0},
			 {0,0,0,1,1,0,0,0,0}
	 };

	private static int[] visited = new int[array.length];

	public static List<List<Character>> doBFS() {
		List<List<Character>> list = new ArrayList<>();

		Queue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < array[0].length; i++) {
			List<Character> tempList = new ArrayList<>();

			queue.add(i);

			if (visited[i] == 0) {
				while (!queue.isEmpty()) {
					int curVertex = queue.poll();

					for (int nextVertex = 0; nextVertex < array[curVertex].length; nextVertex++) {

						if (array[curVertex][nextVertex] == 1 && visited[nextVertex] == 0) {

							// Marking the vertex as visited
							visited[nextVertex] = 1;
							queue.add(nextVertex);

							// Converting array index to character
							tempList.add((char) (nextVertex + 65));
						}
					}
				}
				list.add(tempList);
			}
		}

		System.out.println("No. of Components: " + list.size());
		return list;
	}

	public static void main(String[] args) {
		System.out.println("Components: " + doBFS());
	}

}
