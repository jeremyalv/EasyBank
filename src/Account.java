public class Account {
    private String id;
    private Customer owner;
    private String type;
    private long balance;
    private Transaction[] transactions;
    private int MONTHLY_DEPOSIT_LIMIT = 50;
    private int MAX_WITHDRAWAL_AMT;

    public Account() {

    }

    public Account(Customer owner, String type, long balance) {
        this.owner = owner;
        this.type = type;
        this.balance = balance;
        this.transactions = new Transaction[0];

        this.MONTHLY_DEPOSIT_LIMIT = determineDepositLimit(type);
        this.MAX_WITHDRAWAL_AMT = determineMaxWithdrawalAmt(type);
    }


    // TODO implementation
    private int determineDepositLimit(String type) {
        return 0;
    }

    // TODO implementation
    private int determineMaxWithdrawalAmt(String type) {
        return 0;
    }

    // TODO implementation
    @Override
    public String toString() {
        return "";
    }
}
