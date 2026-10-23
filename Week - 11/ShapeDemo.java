abstract class Shape {

    abstract void numberOfSides();
}

class Trapezoid extends Shape {

    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides");
    }
}

class Triangle extends Shape {

    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {

    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Shape s;

        s = new Trapezoid();
        s.numberOfSides();

        s = new Triangle();
        s.numberOfSides();

        s = new Hexagon();
        s.numberOfSides();
    }
}