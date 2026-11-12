
class BankAccount {
    int balance;
    int overdraftLimit;
    String status;
    
    BankAccount(int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }
        balance = b;
        overdraftLimit = 0;
        status = "ACTIVE";
    }

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (status.equals("CLOSED")) {
            System.out.println("Account is closed");
        } else {
            balance = balance + amount;
            System.out.println("Amount deposited");
        }
    }

    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (!status.equals("ACTIVE")) {
            System.out.println("Account is not active");
        } else if (balance - amount < -overdraftLimit) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        }
    }

    void freeze() {
        if (!status.equals("CLOSED")) {
            status = "FROZEN";
            System.out.println("Account frozen");
        }
    }

    void unfreeze() {
        if (status.equals("FROZEN")) {
            status = "ACTIVE";
            System.out.println("Account active");
        }
    }

    void pause() {
        freeze();
    }

    void close() {
        if (balance == 0) {
            status = "CLOSED";
            System.out.println("Account closed");
        } else {
            System.out.println("Balance must be zero");
        }
    }

    void balanceEnquiry() {
        System.out.println("Balance: " + balance);
    }
}
