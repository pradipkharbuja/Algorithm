package edu.mum.pradip;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Dijkstra {

	private int[][] array;
	private int[] visited;
	private Map<Integer, Integer> map;

	public static final int LARGE_VALUE = 999999999;

	public Dijkstra(int[][] array) {
		this.array = array;
		this.visited = new int[array.length];

		map = new HashMap<>();
	}

	public Map<Character, Integer> doDijkstra() {
		map.put(0, 0);
		visited[0] = 1;

		for (int i = 1; i < array.length; i++) {
			findMinDistanceVertex();
		}

		// convert "key" integer to character
		Map<Character, Integer> result = new HashMap<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			result.put((char) (entry.getKey() + 65), entry.getValue());
		}

		return result;
	}

	public int findMinDistanceVertex() {
		int newVertex = -1;
		int minDistance = LARGE_VALUE;

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int curVetex = entry.getKey();
			for (int j = 0; j < array[curVetex].length; j++) {

				if (visited[j] == 0 && curVetex != j) {
					int newDistance = array[curVetex][j] + entry.getValue();

					if (minDistance > newDistance) {
						minDistance = newDistance;
						newVertex = j;
					}
				}
			}
		}

		if (newVertex != -1) {
			map.put(newVertex, minDistance);
			visited[newVertex] = 1;
		}

		return newVertex;
	}
}
