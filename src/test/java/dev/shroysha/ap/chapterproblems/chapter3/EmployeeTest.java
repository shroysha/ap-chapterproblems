package dev.shroysha.ap.chapterproblems.chapter3;

/**
 * An employee with a name and salary.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee harry = new Employee("Hacker, Harry", 50000);

        System.out.println(harry.getName());
        System.out.println("Expected: Hacker, Harry");
        System.out.println(harry.getSalary());
        System.out.println("Expected: 50000");
        harry.raiseSalary(10); // Harry gets a 10% raise
        System.out.println(harry.getSalary());
        System.out.println("Expected: 55000");
    }

}
