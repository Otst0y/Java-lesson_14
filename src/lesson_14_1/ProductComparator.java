package lesson_14_1;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		return p1.getPrice() < p2.getPrice() ? 1 : -1;
	}

}
