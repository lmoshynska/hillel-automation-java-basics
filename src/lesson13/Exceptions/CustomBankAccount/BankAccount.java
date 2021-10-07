package lesson13.Exceptions.CustomBankAccount;

public class BankAccount {

    private int balance = 100;

    public void depositMoney(int sum) {
        balance += sum;
        System.out.println("You successfully deposited " + sum + " USD. " +
                "\nCurrent balance is " + getBalance());
    }

    public void withdrawMoney(int sum) {
        try{
            if(sum <= getBalance()) {
                balance -= sum;
                System.out.println("You successfully withdrew " + sum + " USD. " +
                        "\nCurrent balance is " + getBalance());
            } else {
                System.out.println("You try to withdraw " + sum);
                throw new InsufficientFundsException("You don't have enough money on your account, " +
                        "available sum is: ", getBalance());
            }
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage() + e.getAmount());
            e.printStackTrace();
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.depositMoney(100);
        bank.depositMoney(200);


        bank.withdrawMoney(150);
        bank.withdrawMoney(500);
        bank.withdrawMoney(100);

    }
}
