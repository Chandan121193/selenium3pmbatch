package testNg;

import org.testng.annotations.Test;

public class priority {
	@Test
	public void a() {
		System.out.println("From method a");
	}
	@Test
	public void d() {
		System.out.println("From method d");
	}
	@Test
	public void b() {
		System.out.println("From method b");
	}
	@Test
	public void c() {
		System.out.println("From method c");
	}
	
	
	

}
