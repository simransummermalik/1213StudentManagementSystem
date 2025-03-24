
/**
 * TODO Write a one-sentence summary of your class here.
 * TODO Follow it with additional details about its purpose, what abstraction
 * it represents, and how to use it.
 *
 * @author  TODO Your Name
 * @version Mar 20, 2025
 */
package problems_solve13;

import java.util.ArrayList;

public class TestProfessor {
     public static void main(String[] args) {

        System.out.println("********** Testing Professor **********");

        Student s1 = new Student("Xavier", "Cato", 9000, "CS", 3.9, 120);
        Student s2 = new Student("Kathrine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 2.3, 86);
        Student s4 = new Student("Kimberly", "Bryant", 902, "EE", 3.0, 90);

        Professor prof1 = new Professor("Mary", "Castro", 903, "CS", 90000);

        prof1.display();

        System.out.println("Department: " + prof1.getDepartment());
        System.out.println("Salary: " + prof1.getSalary());

        prof1.setDepartment("Math");
        prof1.setSalary(95000);

        System.out.println("Department: " + prof1.getDepartment());
        System.out.println("Salary: " + prof1.getSalary());

        prof1.addAdvisee(s1);
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);

        if (prof1.removeAdvisee(902)) {
            System.out.println("Advisee removed");
        } else {
            System.out.println("Advisee not in list");
        }

        if (prof1.removeAdvisee(902)) {
            System.out.println("The advisee has been removed");
        } else {
            System.out.println("This student is not an advisee of Professor "
                    + prof1.getFirstName() + " " + prof1.getLastName());
        }

        ArrayList<Student> myAdvisees = prof1.getAdvisees();
        System.out.println("Professor " + prof1.getFirstName() + " "
                + prof1.getLastName() + " advises:");

        for (Student s : myAdvisees) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
    }
}
    
