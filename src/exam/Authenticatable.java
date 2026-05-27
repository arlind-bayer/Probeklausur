package exam;

/**
 * Authenticatable objects are protected by a PIN. They can be locked and
 * unlocked. Unlocking requires the correct PIN.
 *
 * DO NOT CHANGE THIS FILE.
 */
public interface Authenticatable {

	/**
	 * @return true if the object is currently locked, false otherwise
	 */
	public boolean isLocked();

	/**
	 * Locks an unlocked object. An already locked object stays locked.
	 */
	public void lock();

	/**
	 * Unlocks a locked object if the given PIN is correct.
	 * Throws an exception if the PIN is wrong.
	 * @param pin the PIN used to unlock the object
	 * @throws IllegalArgumentException thrown if the PIN is wrong.
	 *         Exception message: "Wrong PIN."
	 */
	public void unlock(int pin) throws IllegalArgumentException;
}
