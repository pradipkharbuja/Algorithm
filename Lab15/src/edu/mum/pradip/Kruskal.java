package edu.mum.pradip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Finding Minimum Spanning Tree
public class Kruskal {

	private DisjointSet disjointSet;
	private List<Edge> edges;
	private List<Edge> result;

	public Kruskal(int[][] data) {
		edges = new ArrayList<>();
		result = new ArrayList<>();

		char[] universe = new char[data.length];

		for (int i = 0; i < data.length; i++) {
			char s, d;
			d = (char) (i + 65); // destination
			universe[i] = d;

			for (int j = 0; j < i; j++) {
				if (data[i][j] == 0) {
					continue;
				}

				s = (char) (j + 65); // source
				edges.add(new Edge(s, d, data[i][j]));
			}
		}

		disjointSet = new DisjointSet(universe);
		Collections.sort(edges, new EdgeComparator());
	}

	public void perform() {
		for (Edge edge : edges) {
			char source = disjointSet.find(edge.getSourceVertex());
			char destination = disjointSet.find(edge.getDestinationVertex());

			if (source != destination) {
				disjointSet.union(source, destination);
				result.add(edge);
			}
		}
	}

	public int getMinSpanningWeight() {
		int sum = 0;
		for (Edge edge : result) {
			sum += edge.getWeight();
		}
		return sum;
	}

	@Override
	public String toString() {
		return result.toString() + "\nMinimum Spanning Weight: " + this.getMinSpanningWeight();
	}
}
