public class Main  {

    public static void main(String[] args) {
        // Scenario 1 - Instructor registers a course on the learning portal/website

        // Create an instance of the Instructor class
        Instructor instructor = new Instructor("thelegend27", "password", "legend@gmail.com", "John Legend", "44 Business St", "111-222-3333", "PayPal", true);

        // Create an instance of the Course class
        Course course = new Course(44, "Java Programming", 20, "12 Weeks", "John Legend", "RMIT", "Intro to Java", "Programming", 200.00f);

        // Instructor pays the registration fee 
        instructor.payRegistrationFee();

        Instructor.publishCourse(course);

        // Scenario 2 - Lodge a general enquiry about the portal which is successfully addressed by the Manager

        // Create an instance of the Manager class
        Manager manager = new Manager("Manager1", "management", "manager1@gmail.com", "Dave", "16 Dave St", "333-4444-5555", "PayPal", false, 61);

        // Create an instance of the systemEnquiry class
        SystemEnquiry systemEnquiry = new SystemEnquiry(60, "How do I reset my password", false);

        // Post the enquiry to the manager
        systemEnquiry.makeSystemEnquiry();

        // The manager answers the enquiry
        manager.answerSystemEnquiry(systemEnquiry);

    }

}
