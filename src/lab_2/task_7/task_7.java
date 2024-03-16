package lab_2.task_7;

public class task_7 {
    public static void main(String[] args) {
        IBankAcct account = new BankAcct(100);
        System.out.println("Текущий баланс: " + account.getBalance());

        System.out.println("Пополнение на 50");
        account.deposit(50);
        System.out.println("Текущий баланс: " + account.getBalance());

        System.out.println("Снятие 120");
        account.withdraw(120);
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}
