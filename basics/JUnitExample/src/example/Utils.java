package example;

/**
 * Utils
 * @author jabier.martinez
 */
public class Utils {

	/**
	 * The addition of two numbers
	 * 
	 * @param x
	 * @param y
	 * @return the addition
	 */
	public static int addition(int x, int y) {
		return x + y;
	}

	/**
	 * Swap, mutually exchanging the values of two array positions
	 * 
	 * @param array
	 * @param position
	 *            i
	 * @param position
	 *            j
	 * @return array
	 */
	public static String[] swap(String[] a, int i, int j) {
		String t = a[i];
		a[i] = a[j];
		a[j] = t;
		return a;
	}

	/**
	 * Reverse array
	 * 
	 * @param array
	 * @return array
	 */
	protected static String[] reverse(String[] a) {
		for (int i = 0; i <= (a.length / 2) - 1; i++) {
			a = swap(a, i, a.length - i - 1);
		}
		return a;
	}

}
