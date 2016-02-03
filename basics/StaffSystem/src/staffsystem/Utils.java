package staffsystem;

import java.util.Scanner;

/**
 * Utils
 * 
 * @author jabier.martinez
 */
public class Utils {

	/**
	 * the user introduce values in the input and we return the array
	 * 
	 * @return the array
	 */
	public static double[] getCommaSeparatedDoublesFromInput() {
		Scanner in = new Scanner(System.in);
		String[] itemPrices = in.nextLine().split(",");
		double[] prices = new double[itemPrices.length];
		int i = 0;
		while (i < itemPrices.length - 1) {
			prices[i] = Double.parseDouble(itemPrices[i]);
			i++;
		}
		in.close();
		return prices;
	}
}
