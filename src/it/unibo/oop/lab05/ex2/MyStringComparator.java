package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {
	/**
	 * @param s1 first string to compare
	 * 
	 * @param s2 second string to compare  
	 */
	public int compare(final String s1, final String s2) {
		return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
	}
}
