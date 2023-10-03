public class Manager extends User {
    // Class attributes (from class diagram)
    private int enquiryResponseID;

    public Manager(String username, String password, String email, String name, String address, String phoneNumber, String paymentInfo, Boolean isLoggedIn, int enquiryResponseID) {
        super(username, password, email, name, address, phoneNumber, paymentInfo, isLoggedIn);
        this.enquiryResponseID = enquiryResponseID;
    }

    // Getter and setter for enquiryResponseID
    public int getEnquiryResponseID() {
        return enquiryResponseID;
    }

    public void setEnquiryResponseID(int enquiryResponseID) {
        this.enquiryResponseID = enquiryResponseID;
    }

    public void answerSystemEnquiry(SystemEnquiry systemEnquiry) {
        int enquiryID = systemEnquiry.getEnquiryID();
        systemEnquiry.setIsAnswered(true); // sets the enquiry to be answered
        System.out.println("Answering enquiry " + enquiryID);
    }

}

