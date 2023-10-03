public class Main  {

    public static void main(String[] args) {
        // Scenario 1 - Instructor registers a course on the learning portal/website

        // Create an instance of the Instructor class
        Instructor instructor = new Instructor("thelegend27", "password", "legend@gmail.com", "John Legend", "44 Business St", "111-222-3333", "PayPal");

        // Create an instance of the Course class
        Course course = new Course("44", "Java Programming", 20, "12 Weeks", "John Legend", "RMIT", "Intro to Java", "Programming", 200.00);

        // Instructor pays the registration fee 
        instructor.payRegistrationFee();

        Instructor.publishCourse();

    }

}
