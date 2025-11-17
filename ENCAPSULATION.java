class BankAccount {
    private double funds;

    public BankAccount(double startingAmount) {
        this.funds = startingAmount;
    }

    public void depositCash(double value) {
        funds += value;
    }

    public void withdrawCash(double value) {
        if (value <= funds) {
            funds -= value;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double showBalance() {
        return funds;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);
        acc.depositCash(500);
        System.out.println(acc.showBalance());
    }
}
