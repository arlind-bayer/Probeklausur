package exam;

/**
 * A basic bank account. Every account has an owner and a balance.
 *
 * DO NOT CHANGE THIS FILE.
 */
public class Account {

	private String owner;
	private int balance;

	/**
	 * Creates a new account for the given owner with a balance of 0.
	 * @param owner the name of the account owner
	 */
	public Account(String owner) {
		this.owner = owner;
		this.balance = 0;
	}

	/**
	 * @return the name of the account owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @return the current balance of the account
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Adds the given amount to the balance. The amount may be negative,
	 * which reduces the balance.
	 * @param amount the amount to add to the balance
	 */
	public void changeBalance(int amount) {
		balance += amount;
	}
}
