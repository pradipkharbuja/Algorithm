package edu.mum.pradip;

public class Edge {
	private char sourceVertex;
	private char destinationVertex;
	private int weight;

	public Edge(char sourceVertex, char destinationVertex, int weight) {
		super();
		this.sourceVertex = sourceVertex;
		this.destinationVertex = destinationVertex;
		this.weight = weight;
	}

	public char getSourceVertex() {
		return sourceVertex;
	}

	public void setSourceVertex(char sourceVertex) {
		this.sourceVertex = sourceVertex;
	}

	public char getDestinationVertex() {
		return destinationVertex;
	}

	public void setDestinationVertex(char destinationVertex) {
		this.destinationVertex = destinationVertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("{%c, %c, %d}", sourceVertex, destinationVertex, weight);
	}
}