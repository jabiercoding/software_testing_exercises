package casino;

import java.util.Random;

public class Dice {
	int throwDice() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}
}
