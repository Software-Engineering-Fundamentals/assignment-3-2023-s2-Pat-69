public class Enquiry {
    // Class attributes (from class diagram)
    private int enquiryID;
    private String enquiry;
    private Boolean isAnswered;


    // Constructor - Sets initial values for the attributes of Enquiry objects
    public Enquiry(int enquiryID, String enquiry, Boolean isAnswered) {
        this.enquiryID = enquiryID;
        this.enquiry = enquiry;
        this.isAnswered = isAnswered;
    }

    // Getters and Setters (used to modify and access the above private attributes) 
    public int getEnquiryID() {
        return enquiryID;
    }

    public void setEnquiryID() {
        this.enquiryID = enquiryID;
    }

    public String getEnquiry() {
        return enquiry;
    }

    public void setEnquiry() {
        this.enquiry = enquiry;
    }

    public Boolean getIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered() {
        this.isAnswered = isAnswered;
    }

}