package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private final double quantity;

	/**
	 * 
	 * @param name     name of the product
	 * @param quantity quantity of the product
	 */
	public ProductImpl(String name, double quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}
	@Override
	public String toString() {
		return "ProductImpl [name=" + this.name + ", quantity=" + this.quantity + "]";
	}

}
