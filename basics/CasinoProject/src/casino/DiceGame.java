package casino;

/**
 * Dice Game
 */
public class DiceGame {

	/**
	 * Play: We throw two six-sided dice once. We will have 1 million if we
	 * obtain two 6s, and 1 thousand if the sum is 11, otherwise we get 0. In
	 * case of two 6s the director of the casino will be notified.
	 * 
	 * @param dice1
	 * @param dice2
	 * @return the amount of money won by the player
	 */
	public int play(Dice dice1, Dice dice2, NotificationSystem notificationSystem) {
		if (dice1.throwDice() == 6 && dice2.throwDice() == 6) {
			notificationSystem.sendAlertToTheDirector("Someone won 1 million in the Dice Game");
			return 1000000;
		} else if (dice1.throwDice() == 6 && dice2.throwDice() == 5) {
			return 1000;
		} else if (dice1.throwDice() == 5 && dice2.throwDice() == 6) {
			return 1000;
		}
		return 0;
	}
}
