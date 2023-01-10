package question10;

import java.util.ArrayList;

public class Invoice {

	private float sum;
	
	public Invoice(ArrayList<Product> productList) {
		this.sum = productList.stream().map(Product::getPrice).reduce(Float::sum).orElse(0f);
	}

	
	@Override
	public String toString() {
		return "Invoice = " + sum;
	}



	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}
	
	

}
