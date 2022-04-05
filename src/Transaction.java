import java.util.Date;
import java.util.Calendar;
import java.text.Format;
import java.text.SimpleDateFormat;

public class Transaction {
    private String id;
    private Customer customer;
    private String name;
    private long amount;
    private Date date;
    private String type;
    private boolean isVerified;

    public Transaction() {

    }

    public Transaction(Customer customer, String name, long amount, String type) {
        String customerId = customer.getId();

        this.customer = customer;
        this.name = name;
        this.amount = amount;
        this.date = Calendar.getInstance().getTime();

        // 3 letter transaction type
        this.type = type; 

        // Create transaction ID
        this.id = createId(customerId, type, date);
    }

    public String createId(String custId, String type, Date date) {
        // 7 digit date identifier
        Format formatter = new SimpleDateFormat("yyMMddHHmmssZ"); 
        String dt = formatter.format(date);
        
        // Returns 26 digit transaction id
        return custId + type + dt;
    }

    public String getId() {
        return this.id;
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

    
    @Override
    public String toString() {
        return String.format(
            "Transaction Data:\n" 
            + "ID: %s\n"
            + "Name: %s\n"
            + "Type: %s\n"
            + "Purchase Date: %s\n",
            this.id,
            this.name,
            this.type,
            this.date.toString()
        );
    }
}
