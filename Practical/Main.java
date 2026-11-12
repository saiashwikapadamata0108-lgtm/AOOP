
class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1000);
        BankAccount a2 = new BankAccount(500);

        System.out.println("---- DEPOSIT ----");
        a1.deposit(500);

        System.out.println("---- WITHDRAW ----");
        a1.withdraw(200);

        System.out.println("---- BALANCE ----");
        a1.balanceEnquiry();

        System.out.println("---- FUND TRANSFER ----");
        FundTransfer f = new FundTransfer();
        f.transfer(a1, a2, 300);

        System.out.println("---- FREEZE ----");
        a1.freeze();

        System.out.println("---- WITHDRAW FROM FROZEN ACCOUNT ----");
        a1.withdraw(100);

        System.out.println("---- UNFREEZE ----");
        a1.unfreeze();

        System.out.println("---- PAUSE ----");
        a1.pause();

        System.out.println("---- ZERO AMOUNT ----");
        a1.deposit(0);

        System.out.println("---- NEGATIVE AMOUNT ----");
        a1.deposit(-100);

        System.out.println("---- FINAL BALANCE ----");
        a1.balanceEnquiry();

        System.out.println("---- CLOSE ACCOUNT ----");
        a1.unfreeze();
        a1.withdraw(1000);
        a1.close();
    }
}
