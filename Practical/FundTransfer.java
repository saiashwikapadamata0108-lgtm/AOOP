
class FundTransfer {

    void transfer(BankAccount a, BankAccount b, int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else if (!a.status.equals("ACTIVE") ||
                 !b.status.equals("ACTIVE")) {
            System.out.println("Account is not active");
        }
        else if (a.balance - amount < -a.overdraftLimit) {
            System.out.println("Insufficient balance");
        }
        else {
            a.withdraw(amount);
            b.deposit(amount);
            System.out.println("Transfer successful");
        }
    }
}
