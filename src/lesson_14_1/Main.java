package lesson_14_1;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		ProductComparator prodComp = new ProductComparator();
		HashSet<Product> hS = new HashSet<Product>();

		hS.add(new Product("Bread", 3.95, 54));
		hS.add(new Product("Tea", 1.75, 103));
		hS.add(new Product("Milk", 2.90, 78));
		hS.add(new Product("Soda", 2.55, 26));
		hS.add(new Product("Flour", 0.78, 47));
		hS.add(new Product("Butter", 2.65, 34));
		
		System.out.println("Sorting via Comparable:");
		System.out.println();
		
		System.out.println("Before sorting by name:");
		for (Product key : hS) {
			System.out.println(key);
		}
		
		System.out.println();
		
		TreeSet<Product> tS = new TreeSet<Product>();
		tS.addAll(hS);

		System.out.println("After sorting by name:");
		for (Product product : tS) {
			System.out.println(product);
		}

		System.out.println();
		
		System.out.println("Sorting via Comparator:");
		System.out.println();
		
		System.out.println("Before sorting by price:");
		for (Product key : hS) {
			System.out.println(key);
		}
		
		System.out.println();
		
		TreeSet<Product> tSAfter = new TreeSet<Product>(prodComp);
		tSAfter.addAll(hS);

		System.out.println("After sorting by price:");
		for (Product product : tSAfter) {
			System.out.println(product);
		}
	}

}
