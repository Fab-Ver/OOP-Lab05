package it.unibo.oop.lab05.ex3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private final Set<Product> set = newSet();

	@Override
	public void addProduct(Product p) {
		this.set.add(p);
	}

	@Override
	public Set<String> allNames() {
		final Set<String> s = newSet();
		for (Product p : this.set) {
			s.add(p.getName());
		}
		return s;
	}

	@Override
	public Set<Product> allProducts() {
		return newSetFrom(this.set);
	}

	@Override
	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for (Product p : this.set) {
			if (p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}

	private static <E> Set<E> newSet() {
		return new LinkedHashSet<>();
	}

	private static <E> Set<E> newSetFrom(final Collection<E> origin) {
		return new LinkedHashSet<>(origin);
	}

}
