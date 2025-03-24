package problems_solve13;

import java.util.ArrayList;

/**
 * TODO Write a one-sentence summary of your class here.
 * TODO Follow it with additional details about its purpose, what abstraction
 * it represents, and how to use it.
 *
 * @author  TODO Your Name
 * @version Mar 20, 2025
 */
public class Professor extends Person{
    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String firstName, String lastName, int studentId, String department, double salary) {
        super(firstName, lastName, studentId);
        this.department = department;
        this.salary = salary;
        this.advisees = new ArrayList<>();
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addAdvisee(Student student) {
        advisees.add(student);
    }

    public boolean removeAdvisee(int studentId) {
        for (Student student : advisees) {
            if (student.getId() == studentId) {
                advisees.remove(student);
                return true;
            }
        }
        return false;
    }
}
