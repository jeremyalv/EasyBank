public class Customer {
    private static int numOfCustomers;

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
        this.sex = sex; // M, F, O (Others), D (Decline to state)
        this.address = address;
        this.city = city;
        this.yearAsCustomer = 0;
        this.id = generateId();

        incrementCustomers();
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

    public void incrementCustomers() {
        Customer.numOfCustomers++;
    }

    public String generateId() {
        String id;
        String initials = generateInitials(this.name); // 3 characters
        String sx = this.sex; // 1 character
        String city = this.city.substring(0, 3); // 3 characters
        String numOfCustomers = Integer.toString(Customer.numOfCustomers); // 9 digits

        // Build a 16 character string as user id using the above data
        id = numOfCustomers + initials + sx + city;

        return id;
    }

    /* generateInitials will receive a string name and return the first three
    characters of that name.
    */
    private String generateInitials(String name) {
        int count = 0;

        if (name == null) {
            return "";
        }

        String initials = "";

        for (String word: name.split(" ")) {
            if(count != 3) {
                initials += word.charAt(0);
                count++;
            }
        }

        return initials;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer Data:\n" 
            + "Name: %s\n" 
            + "ID: %s\n",
            this.name,
            this.id.toString()
        );
    }
}
