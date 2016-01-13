package mum.pradip;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//PowerSet
/*
 Algorithm: PowerSet(X)
	Input: A list X of elements
	Output: A list P consisting of all subsets of X – elements of P are Sets
	
	P ← new list
	S ← new Set //S is the empty set
	P.add(S) //P is now the set { S }
	T ← new Set
	while (!X.isEmpty() ) do
		f ← X.removeFirst()
		for each x in P do
			T ← x U {f} // T is the set containing f & all elements of x
			P.add(T)
	return P
 */

public class Question05 {

	public static ArrayList<Set<Integer>> powerSet(ArrayList<Integer> x) {
		
		ArrayList<Set<Integer>> p = new ArrayList<>();
		Set<Integer> s = new HashSet<Integer>();

		p.add(s);

		while (!x.isEmpty()) {
			int f = x.remove(0);
	
			ArrayList<Set<Integer>> tempList = new ArrayList<>();
			
			for (Set<Integer> setTemp : p) {
				tempList.add(setTemp);
			}
			
			for (Set<Integer> temp : tempList) {
				Set<Integer> S = new HashSet<>();				
				S.addAll(temp);
				S.add(f);
				p.add(S);
			}		
		}
		return p;

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(5);

		System.out.println(powerSet(list));
	}

}
