public class User {

    // Class attributes (from class diagram)
    private String username;
    private String password;
    private String email;
    private String name;
    private String address;
    private String phoneNumber;
    private String paymentInfo;
    private int enquiryID;
    private Boolean isLoggedIn;

    // Constructor - Sets initial values for the attributes of User objects 
    public User(String username, String password, String email, String name, String address, String phoneNumber, String paymentInfo, Boolean isLoggedIn) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.paymentInfo = paymentInfo;
        this.isLoggedIn = isLoggedIn;
    }

    // Getters and Setters (used to modify and access the above private attributes) 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
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

    public void setPaymentInfo() {
        this.paymentInfo = paymentInfo;
    }

    public Boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsloggedIn() {
        this.isLoggedIn = isLoggedIn;
    }

    /* 
    For the sake of demonstrating the alternate path of the 'Login' sequence diagram, I have created two variables;
    database_username and database_password. They are assigned to be equal to the users actual username and password
    to demonstrate a successful login, however if this was not the case, the system will prompt the user to check their
    username and password.
    */
    public void login(String username, String password, Boolean isloggedIn) {
        String database_username = username;
        String database_password = password;

        if (!username.equals(database_username) || !password.equals(database_password)) {
            isLoggedIn = false;
            System.out.println("Please check username and password");
        } else {
            isLoggedIn = true;
            System.out.println("User logged in");
        }

    }

    public void logout(Boolean isLoggedIn) {
        isLoggedIn = false;
        System.out.println("User logged out");
    }

}
