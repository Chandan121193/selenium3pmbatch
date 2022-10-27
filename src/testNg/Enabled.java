package testNg;

import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void a() {
		System.out.println("From method a");
	}
	@Test(enabled = false)
	public void b() {
		System.out.println("From method b");
	}
	@Test
	public void c() {
		System.out.println("From method c");
	}
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("From method d");
	}

}
