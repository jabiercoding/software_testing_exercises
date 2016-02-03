package example;

import org.junit.Assert;
import org.junit.Test;

import example.Utils;

public class AdditionTest {

	@Test
	public void myTestForAddition() {
		int actual = Utils.addition(1, 1);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void myTestForAdditionWhenZero() {
		int actual = Utils.addition(0, 0);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void myTestForAdditionWhenOverflow() {
		int actual = Utils.addition(Integer.MAX_VALUE, 1);
		int expected = Integer.MIN_VALUE;
		Assert.assertEquals(expected, actual);
	}
}
