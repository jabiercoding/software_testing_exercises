package casino;

/**
 * Casino
 * 
 * @author jabier.martinez
 */
public class Casino {

	private int numberOfPersonsInside = 0;

	/**
	 * A person enters the Casino
	 * 
	 * @param access
	 *            control system
	 * @param passportNumber
	 * @return person actually enters or not
	 */
	boolean personEnters(IAccessControlSystem acs, String passportNumber) {
		if (acs.grantAccess(passportNumber)) {
			numberOfPersonsInside++;
			return true;
		}
		return false;
	}

	/**
	 * A person leaves the Casino
	 * 
	 * @return true when the person actually leaves
	 */
	boolean personLeaves() {
		numberOfPersonsInside--;
		return true;
	}

	/**
	 * get number of persons inside the Casino
	 * 
	 * @return the number of persons inside
	 */
	int getNumberOfPersonsInside() {
		return numberOfPersonsInside;
	}
}
