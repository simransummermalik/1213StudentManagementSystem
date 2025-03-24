package problems_solve13;
public class testperson {
    public static void main(String[] args) {
        Person person = new Person("Ada", "Lovelace", 12345);
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("ID: " + person.getId());
        person.display();
    }
}
    
