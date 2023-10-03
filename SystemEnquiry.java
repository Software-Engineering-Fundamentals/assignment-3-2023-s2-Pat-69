public class SystemEnquiry extends Enquiry {

    // Constructor - Calls on superclass
    public SystemEnquiry(int enquiryID, String enquiry, Boolean isAnswered) {
        super(enquiryID, enquiry, isAnswered);
    }

    // gets the enquiryID and prints a descriptive confirmation.
    public void makeSystemEnquiry() {
        System.out.println("Enquiry " + getEnquiryID() + " posted to management");
    }

}
