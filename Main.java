class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: Rs. " + amount);
            System.out.println("Updated account balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(20000);

        acc.withdraw(5000);
    }
}