package testNg;

import org.testng.annotations.Test;

public class AddProductToCart {
	@Test (groups = "smokeTesting")
	public void login() {
		System.out.println("Login is successful");
	}
	@Test(groups = "regressionTesting")
	public void searchProduct() {
		System.out.println("Product is found");
	}
	@Test(groups = "regressionTesting")
	public void SelectProduct() {
		System.out.println("Product is selected");
	}
	@Test(groups = "regressionTesting")
	public void addToCart() {
		System.out.println("Product to add the cart");
	}
	@Test(groups = "SmokeTesting")
	public void payment() {
		System.out.println("Payment successfull");
	}

}
