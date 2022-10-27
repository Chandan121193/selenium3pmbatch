package testNg;

import org.testng.annotations.Test;

public class DependsOn {
	@Test(priority = 1)
	public void login() {
		System.out.println("Login is successful");
	}
	@Test(dependsOnMethods = "login")
	public void addToCart() {
		System.out.println("The product is added to the cart");
	}
	@Test(dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("Login is successful");
	}

}
