import java.util.Scanner;
class BankAcc {
    private int balance;
    public BankAcc(int initialbalance) {
        this.balance = initialbalance;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Successfully deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(int amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Successfully withdrew.");
        } else if (amt > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
class ATM {
    private BankAcc acc;
    public ATM(BankAcc acc) {
        this.acc = acc;
    }
    public void Details() {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depositAmt = sc.nextInt();
                    deposit(depositAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmt = sc.nextInt();
                    withdraw(withdrawAmt);
                    break;
                case 4:
                    System.out.println("-----Thank you for using the ATM!-----");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (ch != 4);
        sc.close();
    }
    public void checkBalance() {
        System.out.println("Current balance:" + acc.getBalance());
    }
    public void deposit(int amt) {
        acc.deposit(amt);
    }
    public void withdraw(int amt) {
        acc.withdraw(amt);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc(2000);
        ATM atm = new ATM(acc);
        atm.Details();
    }
}
