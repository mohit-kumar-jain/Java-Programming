import java.util.*;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<Integer> employeeIDs = new HashSet<>();

        employeeIDs.add(101);
        employeeIDs.add(102);
        employeeIDs.add(103);
        employeeIDs.add(104);

        // Duplicate ID
        employeeIDs.add(102);

        System.out.println("Employee IDs:");
        System.out.println(employeeIDs);

        // Check ID
        if (employeeIDs.contains(103)) {
            System.out.println("Employee ID 103 is present");
        }

        // Remove ID
        employeeIDs.remove(104);

        System.out.println("After removing 104:");
        System.out.println(employeeIDs);
    }
}