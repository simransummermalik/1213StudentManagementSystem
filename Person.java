package problems_solve13;
public class Person {
    private String firstName;
    private String lastName;
    private int studentId;
    //attributes i think
    public Person(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return studentId;
    }
    public void display() {
        System.out.println("Name:" + firstName + " " + lastName + ", ID:" + studentId);
    }

}