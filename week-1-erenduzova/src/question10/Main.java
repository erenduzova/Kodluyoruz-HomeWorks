package question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {

		// CUSTOMERS

		ArrayList<Customer> customers = new ArrayList<>();

		Customer customer1 = new Customer("Eren", 25);
		Customer customer2 = new Customer("Cem", 28);
		Customer customer3 = new Customer("Cem", 29);
		Customer customer4 = new Customer("Cem", 32);
		Customer customer5 = new Customer("Sami", 26);

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);

		// PRODUCTS

		Product product1 = new Product("Phone", "Iphone 14", 30999, 20);
		Product product2 = new Product("Phone", "Iphone 13", 27699, 25);
		Product product3 = new Product("Mouse", "SteelSeries Rival 3", 414.05f, 92);
		Product product4 = new Product("Mouse", "Asus WT425", 283.1f, 80);
		Product product5 = new Product("Mouse", "Logitech G300s", 400, 150);
		Product product6 = new Product("Mouse", "Logitech G PRO HERO", 2499.9f, 15);

		// ORDERS

		Order order1 = customer1.createOrder();
		order1.add(product1, 1);
		order1.createInvoice();

		Order order2 = customer2.createOrder();
		order2.add(product3, 1);
		order2.add(product4, 2);
		order2.createInvoice();

		Order order3 = customer2.createOrder();
		order3.add(product2, 1);
		order3.createInvoice();

		Order order4 = customer3.createOrder();
		order4.add(product1, 1);
		order4.add(product5, 1);
		order4.createInvoice();

		Order order5 = customer4.createOrder();
		order5.add(product2, 1);
		order5.add(product3, 1);
		order5.createInvoice();

		Order order6 = customer5.createOrder();
		order6.add(product6, 1);
		order6.createInvoice();

		// Print all customers
		customers.forEach(customer -> System.out.println(customer));

		// Print Customer count
		System.out.println("Customer Count = " + customers.stream().count());

		// Print count of the products customers named Cem bought
		System.out.println("Total count of products bought by customers named Cem = "
				+ customers.stream()
				.filter(customer -> customer.getName().equalsIgnoreCase("cem"))
				.map(customer -> customer.getOrders())
				.flatMap(Collection::stream)
				.map(order -> order.getProductList().size())
				.reduce(0, (total, size) -> total + size));

		// Print total price of the customers named Cem and age between 25-30 bought
		System.out.println("Total money of customers named Cem and age between 25-30 spend = "
				+ customers.stream().filter(customer -> customer.getName().equalsIgnoreCase("cem"))
						.filter(customer -> customer.getAge() > 25).filter(customer -> customer.getAge() < 30)
						.map(customer -> customer.getOrders()).flatMap(Collection::stream)
						.map(order -> order.getInvoice().getSum()).reduce(Float::sum).orElse(0f));

		// Print List of invoices bigger than 1500 TL
		System.out.println("List of invoices bigger than 1500 TL = "
				+ Arrays.toString(
						customers.stream().map(customer -> customer.getOrders())
				.flatMap(Collection::stream)
				.map(order -> order.getInvoice())
				.filter(invoice -> invoice.getSum() > 1500f)
				.toArray()));

	}

}
