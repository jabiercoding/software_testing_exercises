package example;

import java.util.Calendar;
import java.util.Random;

import example.others.AirportEntranceSystem;
import example.others.CatFeeder;
import example.others.ICallRegistrySystem;

/**
 * Small examples to illustrate mocking techniques
 * 
 * @author jabier.martinez
 */
public class ClassToBeTested {

	/**
	 * Play lottery
	 * 
	 * Dealing with Randomness
	 */
	public static String playLottery(Random random) {
		if (random.nextDouble() > 0.98) {
			return "Jackpot!";
		} else {
			return "Nothing, continue playing";
		}
	}

	/**
	 * Say hello
	 * 
	 * Improbable cases
	 */
	public static String sayHello(Calendar calendar) {
		if (calendar.get(Calendar.DAY_OF_YEAR) == 1) {
			return "Happy new year!";
		} else {
			return "Hello";
		}
	}

	/**
	 * Call
	 * 
	 * Non implemented interfaces
	 */
	public static String call(int phoneNumber,
			ICallRegistrySystem callRegistrySystem) {
		callRegistrySystem.registerCall(phoneNumber);
		return "Calling " + phoneNumber;
	}

	/**
	 * Register entrance
	 * 
	 * Avoiding unnecessary expensive tasks
	 */
	public static String registerEntranceInAirport(String passport,
			AirportEntranceSystem entranceSystem) {
		entranceSystem.checkPoliceRegistry(passport);
		return "Entrance registered";
	}

	/**
	 * Cat feed
	 * 
	 * Checking some properties of the class, the catFeeder must only call once
	 * to the openFoodContainer method
	 */
	public static String feedCat(CatFeeder catFeeder) {
		return catFeeder.feed();
	}

}
