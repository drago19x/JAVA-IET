package OOPS;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Alice");
        System.out.println("Person's name: " + person.getName());

        // Creating a Student object
        Student student = new Student(101);
        System.out.println("Student's ID: " + student.getId());
    }
}
