package lesson_14_1;

public class Product implements Comparable<Product> {

	String name;
	double price;
	int amount;

	public Product(String name, double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + price + ", amount = " + amount + "]";
	}

	@Override
	public int compareTo(Product p) {

		return this.name.compareTo(p.getName());
	}

}
