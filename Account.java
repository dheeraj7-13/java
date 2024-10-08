class Account {
    // Data members - instance variables
    int acNo;
    String acName;
    double acBal;

    // Constructor - three arguments
    Account(int acNo, String acName, double acBal) {
        this.acNo = acNo;
        this.acName = acName;
        this.acBal = acBal;
    }

    // Define getters and setters
    int getAcNo() {
        return this.acNo;
    }

    void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    String getAcName() {
        return this.acName;
    }

    void setAcName(String acName) {
        this.acName = acName;
    }

    double getAcBal() {
        return this.acBal;
    }

    void setAcBal(double acBal) {
        this.acBal = acBal;
    }

    // Utility method to deposit money
    void deposit(double amt) {
        this.acBal += amt;
    }

    // Method to withdraw money if sufficient amount
    boolean withdraw(double amt) {
        if (this.acBal - amt >= 0) {
            this.acBal -= amt;
            return true;
        } else {
            return false;
        }
    }

    // Method to transfer money to another account
    boolean transfer(Account target, double amt) {
        if (this.withdraw(amt)) {
            target.deposit(amt);
            return true;
        } else {
            return false;
        }
    }
}

class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account(101, "ABC", 2000);
        Account a2 = new Account(102, "PQR", 3000);

        print(a1);
        print(a2);

        a1.deposit(2000);
        System.out.println("Balance after deposit: " + a1.getAcBal());

        // Withdraw amount
        if (a1.withdraw(1000)) {
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Withdrawal unsuccessful, Insufficient funds: " + a1.getAcBal());
        }

        // Transfer money from a1 to a2
        if (a1.transfer(a2, 500)) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer unsuccessful, Insufficient funds: " + a1.getAcBal());
        }

        // Print account balances after transfer
        print(a1);
        print(a2);
    }

    static void print(Account temp) {
        System.out.println("Account Information");
        System.out.println("Ac No: " + temp.getAcNo());
        System.out.println("Ac Name: " + temp.getAcName());
        System.out.println("Ac Balance: " + temp.getAcBal());
        System.out.println();
    }
}
