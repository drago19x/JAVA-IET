package OOPsSampleCode;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        student.setAge(21); // Using setter to change age
        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
    }
}
