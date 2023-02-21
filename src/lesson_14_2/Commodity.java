package lesson_14_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Commodity {

	String name;
	int length;
	int width;
	int weight;

	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name = " + name + ", length = " + length + ", width = " + width + ", weight = " + weight
				+ "]";
	}

	void addProduct(HashSet<Commodity> comm) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name of the product: ");
		String prodName = scan.next();
		System.out.print("Enter length of the product: ");
		int prodLength = scan.nextInt();
		System.out.print("Enter width of the product: ");
		int prodWidth = scan.nextInt();
		System.out.print("Enter weight of the product: ");
		int prodWeight = scan.nextInt();

		Commodity prod = new Commodity(prodName, prodLength, prodWidth, prodWeight);

		comm.add(prod);
	}

	void deleteProduct(HashSet<Commodity> comm) {
		Scanner scan = new Scanner(System.in);
		Iterator<Commodity> it = comm.iterator();
		System.out.print("Enter name of product to delete:");
		String prodName = scan.next();

		while (it.hasNext()) {
			Commodity obj = it.next();
			if (obj.getName().equals(prodName)) {
				it.remove();
			}
		}
	}

	void editProduct(HashSet<Commodity> comm) {
		Scanner scan = new Scanner(System.in);
		Iterator<Commodity> it = comm.iterator();
		System.out.print("Enter name of product to edit:");
		String prodName = scan.next();

		while (it.hasNext()) {
			Commodity obj = it.next();
			if (obj.getName().equals(prodName)) {
				it.remove();
				System.out.print("Enter name of the product: ");
				String newProdName = scan.next();
				System.out.print("Enter length of the product: ");
				int prodLength = scan.nextInt();
				System.out.print("Enter width of the product: ");
				int prodWidth = scan.nextInt();
				System.out.print("Enter weight of the product: ");
				int prodWeight = scan.nextInt();

				Commodity prod = new Commodity(newProdName, prodLength, prodWidth, prodWeight);

				comm.add(prod);
			}
		}
	}

	void showProduct(HashSet<Commodity> comm) {
		Scanner scan = new Scanner(System.in);
		Iterator<Commodity> it = comm.iterator();
		System.out.print("Enter name of product to show:");
		String prodName = scan.next();

		while (it.hasNext()) {
			Commodity obj = it.next();
			if (obj.getName().equals(prodName)) {
				System.out.println(obj);
			}
		}
	}
}
