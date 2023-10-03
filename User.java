public class User {

    // Class attributes (from class diagram)
    private String username;
    private String password;
    private String email;
    private String name;
    private string address;
    private String phoneNumber;
    private String paymentInfo;
    private int enquiryID;

    // Constructor - Sets initial values for the attributes of User objects 
    public User(String username, String password, String email, String name, String address String phoneNumber, String paymentInfo, int enquiryID) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.paymentInfo = paymentInfo;
        this.enquiryID = enquiryID;
    }

    // Getters and Setters (used to modify and access the above private attributes) 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public string getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public int getEnquiryID() {
        return enquiryID;
    }

    public void setEnquiryID() {
        this.enquiryID = enquiryID;
    }
}
