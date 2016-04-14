package casino;

import java.util.Random;

/**
 * Six-sided Dice
 */
public class Dice {

	/**
	 * Throw the dice
	 * 
	 * @return a value from 1 to 6
	 */
	int throwDice() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}
}
