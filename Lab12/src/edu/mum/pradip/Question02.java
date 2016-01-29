
package edu.mum.pradip;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//2. Create a Java program to find all components of a graph given the adjacency matrix through DFS.

public class Question02 {

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

	public static List<List<Character>> doDFS() {
		Stack<Integer> stack = new Stack<Integer>();
		List<List<Character>> list = new ArrayList<>();

		for (int i = 0; i < visited.length; i++) {
			List<Character> tempList = new ArrayList<>();

			stack.push(i);

			if (visited[i] == 0) {
				// Displaying the first vertex of the components
				//System.out.println("Current Vertex: " + i);

				while (!stack.isEmpty()) {
					int curVertex = stack.peek();

					int nextVertex = findNextAdjacentNode(curVertex);
					if (nextVertex != -1) {

						// Marking the vertex as visited
						visited[nextVertex] = 1;
						stack.push(nextVertex);

						// Converting array index to character
						tempList.add((char) (nextVertex + 65));
					} else {
						stack.pop();
					}
				}
				list.add(tempList);
			}
		}
		System.out.println("No. of Components: " + list.size());
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
		// TODO Auto-generated method stub
		System.out.println("Components: " + doDFS());
	}

}
