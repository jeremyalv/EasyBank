public class Bank {
    private Account[] accounts;
    private Transaction[] transactions;
    private long totalCash;
    private double interestRate;
    private int numOfAccounts;

    public static void main(String[] args) {
        Bank program = new Bank();
        program.menu();
    }

    public void menu() {
        // Menu for command line interface
    }

    public Account[] getAccounts() {
        return this.accounts;
    }

    public Transaction[] getTransactions() {
        return this.transactions;
    }

    public long getCash() {
        return this.totalCash;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double newRate) {
        this.interestRate = newRate;
    }

    public void addCash(long addedCash) {
        this.totalCash += addedCash;
    }

    /* addAccount accepts an Account instance and appends it to
       the Bank's list of accounts
    */
    public void addAccount(Account acc) {
        if (this.accounts == null) {
            this.accounts = new Account[0];
        }

        int prevAccAmt = this.accounts.length;
        Account[] newAccounts = new Account[prevAccAmt + 1];

        for (int i = 0; i < prevAccAmt; i++) {
            newAccounts[i] = this.accounts[i];
        }

        newAccounts[prevAccAmt] = acc;

        this.accounts = newAccounts;
    }


    /* method documentation here
       method documentation here
    */
    public void addTransaction(Transaction tsc) {
        if (this.transactions == null) {
            this.transactions = new Transaction[0];
        }

        int prevTscAmt = this.transactions.length;
        Transaction[] newTransactions = new Transaction[prevTscAmt + 1];

        for (int i = 0; i < prevTscAmt; i++) {
            newTransactions[i] = this.transactions[i];
        }

        newTransactions[prevTscAmt] = tsc;

        this.transactions = newTransactions;
    }

    /* method documentation here
       method documentation here
    */
    private Transaction[] sortTransactionsByAmount() {
        return new Transaction[0];
    }

    /* method documentation here
       method documentation here
    */
    private Account[] sortAccountsByAmount() {
        return new Account[0];
    }

    /* method documentation here
       method documentation here
    */
    public Transaction getHighestTransaction() {
        return new Transaction();
    }

    /* method documentation here
       method documentation here
    */
    public Customer getRichestCustomer() {
        return new Customer();
    }
}