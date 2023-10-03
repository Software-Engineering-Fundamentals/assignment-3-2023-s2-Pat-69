public class Instructor extends User {

    public Instructor(String username, String password, String email, String name, String address String phoneNumber, String paymentInfo) {
        super(username, password, email, name, address, phoneNumber, paymentInfo);
    }

    /* 
    For the sake of demonstrating the alternate path of the 'Instructor Creates Course' sequence diagram,
    I have created the boolean variable paymentValid. This variable is initialised to be true to demonstrate
    the successful payment of the registration fee, however if this is not the case, the system will prompt 
    the instructor to check their payment details.
    */
    public Boolean payRegistrationFee() {
        Boolean paymentValid = true 
        if (paymentValid == true) {
            System.out.println("Payment accepted")
        }
        else {
            System.out.println("Payment denied, please check your payment details")
        }
    }

    public Boolean publishCourse(Course course) {
        System.out.println("Course " + course.getCourseID + ", " + course.getTitle + " successfully published")
    }

}