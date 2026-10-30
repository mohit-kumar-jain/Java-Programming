import java.util.*;

public class EmployeeHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> employees = new HashMap<>();

        // Add employees
        employees.put("Mohit", 50000.0);
        employees.put("Rahul", 60000.0);
        employees.put("Amit", 55000.0);

        System.out.println("Employees:");
        System.out.println(employees);

        // Retrieve salary
        System.out.println("Mohit's salary: "
                + employees.get("Mohit"));

        // Update salary
        employees.put("Mohit", 65000.0);

        System.out.println("After updating Mohit's salary:");
        System.out.println(employees);

        // Check employee
        if (employees.containsKey("Rahul")) {
            System.out.println("Rahul is present");
        }

        // Remove employee
        employees.remove("Amit");

        System.out.println("After removing Amit:");
        System.out.println(employees);
    }
}