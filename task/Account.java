public class Account {

    private double balance;

    public Account( double balance) {

        if (balance > 0.0) {
            this.balance = balance;
        }
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        } else if (withdrawAmount > 0.0) {
            balance -= withdrawAmount;
        }
    }
}