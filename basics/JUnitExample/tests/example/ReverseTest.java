package example;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {

	@Test
	public void myReverseTest() {
		// System.out.println("ReverseTest.myReverseTest()");
		String[] actual = Utils.reverse(new String[] { "a", "b", "c" });
		String[] expected = new String[] { "c", "b", "a" };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void myReverseTest2() {
		// System.out.println("ReverseTest.myReverseTest2()");
		String[] actual = Utils.reverse(new String[] { "c" });
		String[] expected = new String[] { "c" };
		Assert.assertArrayEquals(expected, actual);
	}

	// @BeforeClass
	// public static void myBeforeClass(){
	// System.out.println("ReverseTest.myBeforeClass()");
	// }
	//
	//
	// @AfterClass
	// public static void myAfterClass(){
	// System.out.println("ReverseTest.myAfterClass()");
	// }
	//
	// @Before
	// public void myBefore(){
	// System.out.println("ReverseTest.myBefore()");
	// }
	//
	// @After
	// public void myAfter(){
	// System.out.println("ReverseTest.myAfter()");
	// }
}
