package edu.mum.pradip;

public class CheckTime {

	public static void main(String[] args) {
		long startTime, endTime, totalTime;
		
		//DFS
		startTime = System.nanoTime();
		Question02.doDFS();
		endTime =System.nanoTime();
		totalTime = (endTime - startTime)/1000;
		System.out.println("Time for DFS: " + totalTime);

		//BFS
		startTime = System.nanoTime();
		Question03.doBFS();
		endTime =System.nanoTime();
		totalTime = (endTime - startTime)/1000;
		System.out.println("Time for BFS: " + totalTime);

	}

}
