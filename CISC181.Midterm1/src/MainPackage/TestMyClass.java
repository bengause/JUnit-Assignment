package MainPackage;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class TestMyClass extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void TestReturnTrue(){
		boolean tf = MyClass.ReturnTrue();
		assertTrue("What does the function return? ", tf);
	}
	
	@Test
	public void TestAddTwoNumbers(){
		int num = MyClass.AddTwoNumbers(3, 4);
		assertEquals("The two numbers are equal. ", (3+4), num);
	}
	
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
	
}
