
public class ConstructorDemo {
    static class Car {
        String model;
        int year;
        public Car() {
            model = "XYZ";
            year = 2025;
        }
        public Car(String modelName, int modelYear) {
            model = modelName;
            year = modelYear;
        }
        public void displayInfo() {
            System.out.println("Car Model: " + model + ", Year: " + year);
        }
    }

    public static void main(String[] args) {
        System.out.println("Using Default Constructor:");
        Car car1 = new Car();
        car1.displayInfo();
        System.out.println("Using Parameterized Constructor:");
        Car car2 = new Car("Tesla", 2020);
        car2.displayInfo();
    }
}
