package casino;

public class DiceGame {
	public int play(Dice dice1, Dice dice2) {
		int d1n = dice1.throwDice();
		int d2n = dice2.throwDice();
		if (d1n == 6 && d2n == 6) {
			System.out.println("Send mail to the director of the casino");
			return 1000000;
		}
		if (d1n == 6 && d2n == 5) {
			return 1000;
		}
		if (d1n == 5 && d2n == 6) {
			return 1000;
		}
		return 0;
	}
}
