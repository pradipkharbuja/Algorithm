package edu.mum.pradip;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Question03 {

	//private static int[][] array = { { 0, 1, 1 }, { 0, 0, 1 }, { 0, 0, 0 }, };
	
//	private static int[][] array = {
//		{0, 1, 0, 0, 0},
//		{0, 0, 0, 1, 0},
//		{0, 0, 0, 1, 1},
//		{0, 0, 0, 0, 0},
//		{0, 0, 0, 0, 0},
//	};

	private static int[][] array ={ 
		{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0 },
        { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0 },
        { 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } 
   };
	
	private static int[] visited = new int[array.length];

	public static List<Character> doDFS() {
		Stack<Integer> stack = new Stack<Integer>();
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < visited.length; i++) {
					if (visited[i] == 0) {
				// Displaying the first vertex of the components
				//System.out.println("Current Vertex: " + i);
				//System.out.println(Arrays.toString(visited));
				 
						stack.push(i);
				visited[i] = 1;

				while (!stack.isEmpty()) {
					int curVertex = stack.peek();

					int nextVertex = findNextAdjacentNode(curVertex);
					
					if (nextVertex != -1) {
						// Marking the vertex as visited
						visited[nextVertex] = 1;
						stack.push(nextVertex);
						System.out.println(String.format( "Next vertex of {%s} is {%s}", curVertex, nextVertex));
					} else {
						System.out.println(stack.toString());
						// Converting array index to character
						list.add((char) (stack.pop() + 65));
					}
				}
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
		System.out.println("Components: " + doDFS());
	}

}
