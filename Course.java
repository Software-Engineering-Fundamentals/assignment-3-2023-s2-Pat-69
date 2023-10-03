public class Course {

    // Class attributes (from class diagram)
    private int courseID;
    private String title;
    private int enrolmentCount;
    private String courseDuration;
    private String instructorName;
    private String instructorAffiliation;
    private String courseInfo;
    private String courseCategory;
    private float associatedCost;

    // Constructor - Sets initial values for the attributes of Class objects
    public Course(int courseID, String title, int enrolmentCount, String courseDuration, String instructorName, String instructorAffiliation, String courseInfo, String courseCategory, float associatedCost) {
        this.courseID = courseID;
        this.title = title; 
        this.enrolmentCount = enrolmentCount;
        this.courseDuration = courseDuration;
        this.instructorName = instructorName;
        this.instructorAffiliation = instructorAffiliation;
        this.courseInfo = courseInfo;
        this.courseCategory = courseCategory;
        this.associatedCost = associatedCost;
    }

    // Getters and Setters (used to access and modify the above private attributes)
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEnrolmentCount() {
        return enrolmentCount;
    }

    public void setEnrolmentCount(int enrolmentCount) {
        this.enrolmentCount = enrolmentCount;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorAffiliation() {
        return instructorAffiliation;
    }

    public void setInstructorAffiliation(String instructorAffiliation) {
        this.instructorAffiliation = instructorAffiliation;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public float getAssociatedCost() {
        return associatedCost;
    }

    public void setAssociatedCost(float associatedCost) {
        this.associatedCost = associatedCost;
    }

}
