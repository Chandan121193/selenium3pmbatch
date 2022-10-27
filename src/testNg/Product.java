package testNg;

import org.testng.annotations.Test;

public class Product {
	@Test(priority = 1)
	public void login() {
		System.out.println("Login is successful");
	}
	@Test(priority = 2)
	public void searchProduct() {
		System.out.println("Product Found");
	}
	@Test(priority = 3)
	public void SelectProduct() {
		System.out.println("Product is Selected");
	}
	@Test(priority = 4)
	public void AddToCart() {
		System.out.println("The product is added to cart");
	}
	@Test(priority = 5)
	public void Payment() {
		System.out.println("Payment successful");
	}
	

}
