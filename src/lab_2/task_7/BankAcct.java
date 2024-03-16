package lab_2.task_7;

public class BankAcct implements IBankAcct {
    private double balance;
    public BankAcct(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public double deposit(double amount) {
        this.balance += amount;
        return this.getBalance();
    }

    @Override
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.getBalance();
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
