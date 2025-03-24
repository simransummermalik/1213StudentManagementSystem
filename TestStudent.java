package problems_solve13;
import java.util.ArrayList;
public class TestStudent {
    public static void main(String[] args) {
        System.out.println("***** Testing Student *****");

        Student s1 = new Student("Xavier", "Cato", 9000, "CS", 3.5, 120);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java");
        s1.addCourse("Calculus");
        s1.addCourse("Spanish");

        s1.display();

        System.out.println("Credits: " + s1.getCredits());
        System.out.println("GPA: " + s1.getGpa());
        System.out.println("Major: " + s1.getMajor());
        System.out.println("Transfer: " + s1.isTransfer());

        s1.setCredits(0);
        s1.setGpa(0);
        s1.setMajor("Math");

        System.out.println("Credits: " + s1.getCredits());
        System.out.println("GPA: " + s1.getGpa());
        System.out.println("Major: " + s1.getMajor());

        if (s1.dropCourse("Spanish")) {
            System.out.println("The class has been dropped");
        } else {
            System.out.println("The class does not exist");
        }

        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("You are enrolled in the following courses:");
        for (String course : enrolledCourses) {
            System.out.println(course);
        }
    }
}