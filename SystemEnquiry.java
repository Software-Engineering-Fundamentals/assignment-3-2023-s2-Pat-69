public class SystemEnquiry extends Enquiry {

    // Constructor - Calls on superclass
    public SystemEnquiry(int enquiryID, String enquiry, Boolean isAnswered) {
        super(enquiryID, enquiry, isAnswered);
    }


    public void postToManager() {
        System.out.println("Enquiry " + getEnquiryID() + " posted to management")
    }

}