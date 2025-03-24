/**
 * TODO Write a one-sentence summary of your class here. Student class
 * TODO Follow it with additional details about its purpose, what abstraction
 * it represents, and how to use it.
 *
 * @author  TODO Your Name
 * @version Mar 18, 2025
 */
package problems_solve13;

import java.util.ArrayList;

public class Student extends Person {
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;

    public Student(String firstName, String lastName, int StudentId, String major, double gpa, int credits) {
        super(firstName, lastName, StudentId);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        this.balance = 0.0;
        this.transfer = false;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getMajor() {
        return major;
    }
    public double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addCourse(String course) {
        enrolledCourses.add(course);
    }
    public boolean dropCourse(String course) {
        return enrolledCourses.remove(course);
    }
}
