/**
 * This class simulates a bank account that stores and keeps track of money from deposits for withdrawal, and calculates interest
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/19/25
 */

public class BankAccount {

    private double balance, deposit, withdraw, interest, monthlyIntRate;

    /**
     * Creates an empty BankAccount with a default monthly interest rate of 0.044/12
     */
    public BankAccount() {
        balance = 0;
        deposit = 0;
        withdraw = 0;
        interest = 0;
        monthlyIntRate = 0.044/12;
    }

    /**
     * Creates a BankAccount with the given balance and interest rate converted to monthly
     * @param inBalance The starting balance of the BankAccount
     * @param intRate The interest rate as a percent
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        deposit = 0;
        withdraw = 0;
        interest = 0;
        monthlyIntRate = intRate/100/12;
    }

    /**
     * Creates a BankAccount with the given balance and interest rate converted to monthly
     * @param inBalance The starting balance of the BankAccount
     * @param intRate The interest rate as a percent
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        deposit = 0;
        withdraw = 0;
        interest = 0;
        monthlyIntRate = intRate/100/12;
    }

    /**
     * Makes a deposit into the BankAccount
     * @param add The amount of money to be added
     */
    public void makeDeposit(int add) {
        balance += add;
        deposit += add;
    }

    /**
     * Makes a deposit into the BankAccount
     * @param add The amount of money to be added
     */
    public void makeDeposit(double add) {
        balance += add;
        deposit += add;
    }

    /**
     * Withdraws money from the BankAccount
     * @param sub The amount of money to be withdrawn
     */
    public void makeWithdraw(int sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Withdraws money from the BankAccount
     * @param sub The amount of money to be withdrawn
     */
    public void makeWithdraw(double sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Calculates the interest for this month based on the balance and monthlyIntRate
     */
    public void calcInterest() {
        if (balance > 0) {
            balance += monthlyIntRate * balance;
            interest += monthlyIntRate * balance;
        }
    }

    /**
     * Returns the balance of the BankAccount
     * @return The balance as a double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the total deposit amounts of the BankAccount
     * @return The total deposit amounts as a double
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Returns the total withdrawal amounts of the BankAccount
     * @return The total withdrawal amounts as a double
     */
    public double getWithdraw() {
        return withdraw;
    }

    /**
     * Returns the total interest accrued by the BankAccount
     * @return The total interest accrued as a double
     */
    public double getInterest() {
        return interest;
    }

}
