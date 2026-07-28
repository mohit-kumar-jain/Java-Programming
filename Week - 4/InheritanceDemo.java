class Employee {
    private double salary = 50000;
    protected String benefits = "Health Insurance";
    public String companyName = "TechCorp";

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void displayManagerDetails() {
        System.out.println ("\nSingle Inheritance & Member Access :");
        System.out.println("Company: " + companyName);
        System.out.println("Benefits: " + benefits);
        System.out.println("Salary: $" + getSalary());
    }
}

class Director extends Manager {
    public void displayDirectorDetails() {
        System.out.println("\nMultilevel Inheritance :");
        System.out.println("Director inherits from Manager and Employee.");
        System.out.println("Company: " + companyName);
    }
}

class Engineer extends Employee {
    public void displayEngineerDetails() {
        System.out.println("\nHierarchical Inheritance :");
        System.out.println("Engineer shares the same parent class as Manager.");
        System.out.println("Company: " + companyName);
    }
}

interface Sportsman {
    void playSports();
}

interface Musician {
    void playInstrument();
}

class TeamLead extends Director implements Sportsman, Musician {
    public void playSports() {
        System.out.println("Plays Basketball on weekends.");
    }

    public void playInstrument() {
        System.out.println("Plays the Guitar in a band.");
    }

    public void displayHybridDetails() {
        System.out.println("\nMultiple & Hybrid Inheritance :");
        System.out.println("TeamLead combines Class Hierarchy and Interfaces.");
        System.out.println("Company: " + companyName);
        playSports();
        playInstrument();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.displayManagerDetails();

        Director dir = new Director();
        dir.displayDirectorDetails();

        Engineer eng = new Engineer();
        eng.displayEngineerDetails();

        TeamLead lead = new TeamLead();
        lead.displayHybridDetails();
    }
}
