package casino;

/**
 * Interface for Access Control System
 */
public interface IAccessControlSystem {

	/**
	 * grant access
	 * 
	 * @param passportNumber
	 * @return whether the access is granted or not
	 */
	public boolean grantAccess(String passportNumber);
}
