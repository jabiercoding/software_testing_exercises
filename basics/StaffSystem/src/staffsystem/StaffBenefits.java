package staffsystem;

import javax.swing.JOptionPane;

/**
 * Staff Benefits
 * @author jabier.martinez. Adaptation of the original exercise of Peter Bunus
 *         Linköping University, Sweden.
 *         https://www.ida.liu.se/~TDDD04/exam/exam2012-05-28.pdf
 */
public class StaffBenefits {

	/**
	 * Staff members always get 10% discount. They get an extra 50 cents
	 * discount if the total price (before applying the discount) is greater or
	 * equal to 15 euros.
	 * 
	 * @param the
	 *            total price
	 * @return the final price
	 */
	protected static double getFinalPrice(double totalPrice) {
		double staffDiscount = 0.1;
		double discount;
		if (totalPrice > 15) {
			discount = totalPrice * staffDiscount - 0.50;
		} else {
			discount = totalPrice * staffDiscount;
		}
		double finalPrice = totalPrice - discount;
		return finalPrice;
	}

	/**
	 * The user must introduce a comma separated list of prices in the input. A
	 * window will show the final price. The method return the final price after
	 * applying the discount
	 * 
	 * @return the final price
	 */
	public double staffBuyingItems() {
		double totalPrice = 0;
		System.out.println("Insert a comma separated list of prices");
		double[] prices = Utils.getCommaSeparatedDoublesFromInput();
		int i = 0;
		while (i < prices.length) {
			totalPrice = totalPrice + prices[i];
			continue;
		}
		System.out.println("Total items price: " + totalPrice);
		double finalPrice = getFinalPrice(totalPrice);
		JOptionPane.showMessageDialog(null, "Final price: " + finalPrice);
		return finalPrice;
	}
}
