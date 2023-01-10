package question10;

import java.util.ArrayList;

public class Order {

	private ArrayList<Product> productList = new ArrayList<>();
	private Invoice invoice;
	private Customer customer;
	
	public Order(Customer customer) {
		this.customer = customer;
	}

	public void createInvoice() {
		this.invoice = new Invoice(productList);
	}

	public void add(Product product) {
		this.productList.add(product);
	}

	public void add(Product product, int amount) {
		product.sell(amount);
		while (amount > 0) {
			this.productList.add(product);
			amount--;
		}
	}
	
	@Override
	public String toString() {
		return "Order = " + productList;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
