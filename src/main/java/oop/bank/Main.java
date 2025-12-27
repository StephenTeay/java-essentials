package oop.bank;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("Ayomide",AcctType.SAVINGS);
        account.generateAccount();
        System.out.println("Account Number generated: "+account.getAccountNumber());
        account.deposit(1000000);
        System.out.println(account.getBalance());
        System.out.println(account.withdraw(10000000));
        System.out.println(account.getBalance());

    }
}
