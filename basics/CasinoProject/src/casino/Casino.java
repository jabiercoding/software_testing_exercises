package casino;

/**
 * Casino
 * 
 * @author jabier.martinez
 */
public class Casino {

	private int numberOfPersonsInside = 0;

	boolean personEnters(IAccessControlSystem acs, String passportNumber) {
		if (acs.grantAccess(passportNumber)) {
			numberOfPersonsInside++;
			return true;
		}
		return false;
	}

	boolean personExits() {
		numberOfPersonsInside--;
		return true;
	}

	int getNumberOfPersonsInside() {
		return numberOfPersonsInside;
	}
}
