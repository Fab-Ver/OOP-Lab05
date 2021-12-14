package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */

public final class UseSetWithOrder {

	private UseSetWithOrder() {
	}

	public static final int ELEM = 100;

	/**
	 * @param args ignored
	 */
	public static void main(final String[] args) {
		/*
		 * Write a program which:
		 * 
		 * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define a new
		 * Comparator in a separate class.
		 */
		final var set = new TreeSet<>(new MyStringComparator());
		/*
		 * 2) Inserts in the set a hundred strings containing randomly generated numbers
		 * (use Math.random())
		 */
		for (int i = 0; i < ELEM; i++) {
			set.add(Double.toString(Math.random()));
		}
		/*
		 * 3) Prints the set, which must be ordered
		 */
		System.out.print(set);
	}
}
