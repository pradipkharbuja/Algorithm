package edu.mum.pradip;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {

	private Map<Character, Character> map;
	
	public DisjointSet(char[] universe) {
		map = new HashMap<>();
		
		for(char c: universe){
			map.put(c, c);
		}
	}

	public char find(char element) {
		char nextParent = map.get(element);
		if (nextParent == element) {
			return element;
		} else {
			return find(nextParent);
		}
	}

	public void union(char source, char destination) {
		map.put(destination, source);
	}

	@Override
	public String toString() {
		return map.toString();
	}
}
