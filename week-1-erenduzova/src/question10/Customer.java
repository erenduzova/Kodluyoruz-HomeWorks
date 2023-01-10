package question10;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {

	private String name;
	private int age;

	private ArrayList<Order> orders = new ArrayList<>();

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public Order createOrder() {
		Order order = new Order(this);
		addOrder(order);
		return order;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", orders=" + Arrays.toString(orders.toArray()) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

}
