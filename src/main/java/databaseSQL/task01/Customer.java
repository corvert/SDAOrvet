package databaseSQL.task01;

public class Customer {

    private static int customerId;
    private String fullName;
    private String address;
    private String email;
    private String phone;

    public Customer(String fullName, String address, String email, String phone) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public static int getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(int customerId) {
        Customer.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
