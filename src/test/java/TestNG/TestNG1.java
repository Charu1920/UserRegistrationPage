package TestNG;

import org.testng.annotations.*;

public class TestNG1 {

	@Test
	public void test1() {
		System.out.println("This is the test1 in testng framework");
	}
	@BeforeTest
	public void test2() {
		System.out.println("This is the test2 in testng framework");
	}
	@BeforeClass
	public void test4() {
		System.out.println("This is the test2 in testng framework");
	}
	@AfterTest
	public void test3() {
		System.out.println("This is the test3 in testng framework");
	}
}
