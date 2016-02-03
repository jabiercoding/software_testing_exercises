package example;

import org.junit.Assert;
import org.junit.Test;

import example.Utils;

public class SwapTest {

	@Test
	public void myTestForSwap() {
		String[] actual = Utils.swap(new String[] { "a", "b", "c" }, 0, 1);
		String[] expected = new String[] { "b", "a", "c" };
		Assert.assertArrayEquals(expected, actual);
	}
}
