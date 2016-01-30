package edu.mum.pradip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Question03 {

	// private static int[][] array = { { 0, 1, 1 }, { 0, 0, 1 }, { 0, 0, 0 },
	// };

	// private static int[][] array = {
	// {0, 1, 0, 0, 0},
	// {0, 0, 0, 1, 0},
	// {0, 0, 0, 1, 1},
	// {0, 0, 0, 0, 0},
	// {0, 0, 0, 0, 0},
	// };

	private static int[][] array = { { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0 },
			{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

	private static int[] visited = new int[array.length];

	public static List<Integer> doDFS() {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<>();

		// Add all vertices having no in degree
		for (int i = 0; i < array.length; i++) {
			int countZero = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[j][i] == 0) {
					countZero++;
				}
			}
			if (countZero == array[i].length) {
				stack.push(i);
				visited[i] = 1;
			}
		}

		while (!stack.isEmpty()) {
			int curVertex = stack.peek();

			int nextVertex = findNextAdjacentNode(curVertex);

			if (nextVertex != -1) {
				// Marking the vertex as visited
				visited[nextVertex] = 1;
				stack.push(nextVertex);
			} else {
				list.add(stack.pop());
			}
		}

		Collections.reverse(list);
		return list;
	}

	public static int findNextAdjacentNode(int vertex) {
		int countZero = 0;
		int i = 0;

		for (i = 0; i < array[vertex].length; i++) {
			countZero++;
			if (i != vertex && array[vertex][i] == 1 && visited[i] == 0) {
				return i;
			}
		}

		// If the vertex is a single disconnected vertex
		if (countZero == i && visited[vertex] == 0) {
			return vertex;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Topological Order: ");
		List<Integer> list = doDFS();
		int count = 1;

		for (int i : list) {
			System.out.println(String.format("Position %d: Vertex %d", count++, i));
		}
	}

}
