public class Customer {
    private String id;
    private Account account;
    private String name;
    private int age;
    private String sex;
    private String address;
    private String city;
    private int yearAsCustomer;

    public Customer() {

    }

    public Customer(Account account, String name, int age,
                    String sex, String address, String city) {
        this.account = account;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.city = city;
        this.yearAsCustomer = 0;
        this.id = generateCustomerId();
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void incrementYear() {
        this.yearAsCustomer++;
    }

    // TODO implementation
    private String generateCustomerId() {
        return "";
    }

    // TODO implementation
    @Override
    public String toString() {
        return "";
    }
}
