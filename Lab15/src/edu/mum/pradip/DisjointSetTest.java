package edu.mum.pradip;

public class DisjointSetTest {

	public static void main(String[] args) {
		char[] universe = { 'a', 'b', 'c', 'd', 'e' };

		DisjointSet disjointSet = new DisjointSet(universe);

		System.out.println("Parent of a is " + disjointSet.find('a'));
		System.out.println("Parent of b is " + disjointSet.find('b'));
		System.out.println("After union ");

		disjointSet.union('a', 'b');

		System.out.println("Parent of a is " + disjointSet.find('a'));
		System.out.println("Parent of b is " + disjointSet.find('b'));
		System.out.println(disjointSet);
	}
}
