package codefinity;

/**
 * This class represents a simple model of a bank transaction.
 * It allows depositing and withdrawing money from an account,
 * as well as checking the current balance.
 */
public class BankTransaction {
    private double balance; // Variable to store the current balance of the account

    /**
     * Constructor for creating a new BankTransaction instance.
     * It initializes the balance. If a negative balance is passed,
     * it sets the balance to 0, ensuring that the balance is never negative.
     *
     * @param initialBalance The initial balance to set for this account.
     */
    public BankTransaction(double initialBalance) {
        this.balance = Math.max(initialBalance, 0); // Set balance to initialBalance or 0 if initialBalance is negative
    }

    /**
     * Method to deposit money into the account.
     * If a non-positive amount is passed, the method returns false,
     * indicating the operation was not successful.
     * Otherwise, it adds the amount to the balance and returns true.
     *
     * @param amount The amount of money to deposit.
     * @return boolean This returns true if the deposit was successful, false otherwise.
     */
    public boolean deposit(double amount) {
        if (amount <= 0) { // Check if the deposit amount is positive
            return false; // Deposit operation fails if amount is not positive
        }
        balance += amount; // Add the amount to the current balance
        return true; // Return true indicating successful deposit
    }

    /**
     * Method to withdraw money from the account.
     * If a non-positive amount is passed or if the balance is less than
     * the amount to withdraw, the method returns false,
     * indicating the operation was not successful.
     * Otherwise, it subtracts the amount from the balance and returns true.
     *
     * @param amount The amount of money to withdraw.
     * @return boolean This returns true if the withdrawal was successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (amount <= 0 || balance < amount) { // Check if the withdrawal amount is positive and if sufficient balance is available
            return false; // Withdrawal operation fails if amount is not positive or if insufficient balance
        }
        balance -= amount; // Subtract the amount from the current balance
        return true; // Return true indicating successful withdrawal
    }

    /**
     * Method to get the current balance of the account.
     * This method does not modify the state of the account.
     *
     * @return double This returns the current balance of the account.
     */
    public double getBalance() {
        return balance; // Return the current balance
    }
}
