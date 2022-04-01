import java.util.Date;
import java.util.Calendar;
import java.text.Format;
import java.text.SimpleDateFormat;

public class Transaction {
    private String transactionId;
    private Customer customer;
    private String name;
    private long amount;
    private Date date;
    private String type;
    private boolean isVerified;

    public Transaction() {

    }

    // TODO user and transaction ID creation
    public Transaction(Customer customer, String name, long amount, String type) {
        String customerId = customer.getId();

        this.customer = customer;
        this.name = name;
        this.amount = amount;
        this.date = Calendar.getInstance().getTime();
        this.type = type;

        // Create transaction ID
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        this.transactionId = formatter.format(date);
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public String getName() {
        return this.name;
    }

    public long getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }

    public String getType() {
        return this.type;
    }

    public boolean getValidity() {
        return this.isVerified;
    }

    // TODO implementation
    @Override
    public String toString() {
        return "";
    }
}
