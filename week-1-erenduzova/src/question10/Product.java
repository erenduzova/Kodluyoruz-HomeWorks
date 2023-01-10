package question10;

public class Product {

	private String category;
	private float price;
	private String name;
	private int stock;

	public Product(String category, String name, float price, int stock) {
		this.category = category;
		this.price = price;
		this.name = name;
		this.stock = stock;
	}

	public void sell(int amount) {
		if (amount > this.stock) {
			System.out.println("Can't buy more than stock");
		} else {
			this.stock -= amount;
		}
	}
	

	@Override
	public String toString() {
		return "[category = " + category + ", price =" + price + ", name =" + name + "]";
	}

	public void buy(int amount) {
		this.stock += amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
