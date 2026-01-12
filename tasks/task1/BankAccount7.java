 public class BankAccount7 {
    
    private double balance;

    BankAccount7(double initialBalance) {
        balance = initialBalance;
    }
   
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount7 account = new BankAccount7(1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
// using scanner
/*import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Final balance: " + account.getBalance());

        sc.close();
    }
}
*/