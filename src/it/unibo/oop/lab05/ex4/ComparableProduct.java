package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

	/**
	 * 
	 * @param name     name of the comparable product.
	 * @param quantity quantity of the comparable product.
	 */
	public ComparableProduct(String name, double quantity) {
		super(name, quantity);
	}

	@Override
	public int compareTo(final Product o) {
		return getName().compareTo(o.getName());
	}

}
