package example;

// We add import static to avoid to put Mockito.mock all the time
import static org.mockito.Mockito.*;

import java.util.Calendar;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import example.others.AirportEntranceSystem;
import example.others.CatFeeder;
import example.others.CatFoodContainer;
import example.others.ICallRegistrySystem;

/**
 * Testing ClassToBeTested using mocks
 * 
 * @author jabier.martinez
 */
public class MyTestCases {

	@Test
	public void testPlayLottery() {
		// Mocking Random class
		Random mockedRandom = mock(Random.class);

		// Jackpot
		when(mockedRandom.nextDouble()).thenReturn(0.99);
		String actual = ClassToBeTested.playLottery(mockedRandom);
		String expected = "Jackpot!";
		Assert.assertEquals(actual, expected);

		// Nothing
		when(mockedRandom.nextDouble()).thenReturn(0.7);
		actual = ClassToBeTested.playLottery(mockedRandom);
		expected = "Nothing, continue playing";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSayHello() {
		// Mock the calendar
		Calendar calendar = mock(Calendar.class);
		when(calendar.get(Calendar.DAY_OF_YEAR)).thenReturn(1);
		String actual = ClassToBeTested.sayHello(calendar);
		String expected = "Happy new year!";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCall() {
		// Mock the interface to create an instance of this interface
		ICallRegistrySystem crs = mock(ICallRegistrySystem.class);
		when(crs.registerCall(anyInt())).thenReturn(true);
		String actual = ClassToBeTested.call(1234567, crs);
		String expected = "Calling 1234567";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testRegisterEntranceInAirport() {
		// Mock the class
		AirportEntranceSystem aes = mock(AirportEntranceSystem.class);
		// Avoid calling the real method when testing
		when(aes.checkPoliceRegistry(any(String.class))).thenReturn(true);
		String actual = ClassToBeTested.registerEntranceInAirport("4444", aes);
		String expected = "Entrance registered";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFeedOnlyOne() {
		CatFeeder catFeeder = new CatFeeder();
		// Mock the class
		CatFoodContainer container = mock(CatFoodContainer.class);
		catFeeder.setContainer(container);
		// Do it
		catFeeder.feed();
		// Verify
		verify(container, times(1)).openFoodContainer();
	}
}
