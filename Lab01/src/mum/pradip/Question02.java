package mum.pradip;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Brute Force Solution SubsetSum Problem

/*
Problem 2. Brute Force Solution. Formulate your own procedure for solving the SubsetSum
Problem. Think of it as a Java method subsetsum that accepts as input S, k, and outputs a
subset T of S with the property that the sum of the si in T is k if such a T exists, or null if no
such T can be found. (A non-null return value can be thought of as a return of “true” and a null
return value signifies “false.”) Implement your idea in Java code.
*/

//http://stackoverflow.com/questions/1463284/hashset-vs-treeset

public class Question02 {

	public static Set<Integer> subSetSum(List<Integer> array, int sum) {

		List<Set<Integer>> list = new ArrayList<>();

		list.add(new HashSet<Integer>());

		while (!array.isEmpty()) {
			int temp = array.remove(0);

			List<Set<Integer>> tempList = new ArrayList<>();

			for (Set<Integer> x : list) {
				tempList.add(x);
			}

			for (Set<Integer> x : tempList) {
				Set<Integer> S = new HashSet<>();
				S.addAll(x);
				S.add(temp);
				list.add(S);
			}
		}

		 System.out.println(list.toString());

		for (Set<Integer> set : list) {
			int tempSum = 0;
			for (Integer i : set) {
				tempSum += i;
			}
			if (tempSum == sum) {
				return set;
			}

		}
		return null;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(6);

		System.out.println(subSetSum(list, 6));
	}

}
