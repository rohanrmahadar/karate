package implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;

	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("Apple macbook pro");
		productList.add("Apple macbook air");
		productList.add("Apple iphone 12");
		return productList;

	}

}
