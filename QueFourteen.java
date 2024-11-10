package ASSIGNMENT2;
import java.util.Scanner;
class Employee {
    int emp_id;
    String emp_name;
    double basic_salary , gross_salary;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emp ID: ");
        emp_id = sc.nextInt();
        System.out.print("Enter Name: ");
        emp_name = sc.next();
        System.out.print("Enter Basic Salary: ");
        basic_salary = sc.nextDouble();
    }
    void calculateGrossSalary() {
        double hra = 0.1 * basic_salary;
        double da = 0.05 * basic_salary;
        gross_salary = basic_salary + hra + da;
    }

    void display() {
        System.out.println("Emp ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }


}
public class QueFourteen {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.accept();
        emp.calculateGrossSalary();
        emp.display();
    }
}
